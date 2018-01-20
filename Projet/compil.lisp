(load "assoclist.lisp")

(defun file-to-list (filename)
  (get-file-lisp (open filename) '()))

(defun get-file-lisp (file expr)
  (let ((x (read file nil)))
    (if (null x);EOF
	expr
      (get-file-lisp file (cons x expr)))))
  
(defun separate-defun-main (expr def funcnames main)
  (if (null expr)
      (list def funcnames main)
    (if (eq (caar expr) 'defun)
	(separate-defun-main (cdr expr) 
			     (cons (car expr) def)
			     (if (null (list_assoc_search funcnames (cadar expr)))
				 (list_assoc_add funcnames (cadar expr) (length (caddar expr)));add list funcname
			       (error "Function defined at least twice"))
			     main)
      (separate-defun-main (cdr expr) def funcnames (cons (car expr) main)))))

(defun compile-progx (expr cDepth depth env funcnames)
  (if (null expr)
      nil
    (append (step1 (car expr) env funcnames nil);;no terminal recursivity optimisation.
	    (if (= depth cDepth)
		nil
	      '(POP R0)))));;if we don't need to keep the last returned value, we don't. Cleanup will remove the useless push/pop 


(setf label 0)
(defun next_label ()
  (setf label (+ label 1)))

(defun compile-args (list-arg env funcnames)
  (if (null list-arg)
      nil
    (append (step1 (car list-arg) env funcnames nil)
	    (list '(PUSH R0))
	    (compile-args (cdr list-arg) env funcnames))))

(defun make-env (list-arg nb-arg)
  (if (eq 0 nb-arg)
      nil
    (cons (cons (car list-arg) nb-arg) (make-env (cdr list-arg) (- nb-arg 1)))))


(defun step1 (expr env funcnames currentFunc);; currentFunc is the name of the function we're currently defining if it's eligible for terminal compilation
  (progn
    ;;(print expr)
    (cond 
     ((atom expr)
      (progn 
	;;(print "atom")
	(if (constantp expr)
	    (cons (list 'MOVE expr 'R0) nil)
	  (let ((a (list_assoc_search env expr)))
	    (if (not (null a))
		(list '(MOVE FP R0)
		      (list 'SUB (cdr a) 'R0);(cdr a) position dans la liste d'arguments de la func
		      '(LOAD R0 R0))
	      (error "~s Variable doesn't exist." expr)
	      )))))
     ;; ((atom (car expr) ;si 
     
     ((equal (car expr) 'if)
      (progn 
	;;(print "if")
	;; (print (cadr expr))
	;; (print (caddr expr))
	;; (print (cadddr expr))
	(append (step1 (cadr expr) env funcnames nil)
		(list '(CMP R0 nil))
		(let ((else (next_label))
		      (end (next_label)))
		  
		  (append
		   (list 
		    (if (not (null (cadddr expr)))
			(list 'JEQ else)
		      (list 'JEQ end)))
		   (step1 (caddr expr) env funcnames currentFunc)
		   
		   (if (not (null (cadddr expr)))
		       (append (list (list 'JMP end)
				     (list 'LABEL else))
			       (step1 (cadddr expr) env funcnames currentFunc)
			       (list (list 'JMP end))
			       )
		     )
		   (list (list 'LABEL end)))))))

     ((equal (car expr) 'defun)
      (progn 
	;;(print "defun")    
	(if (not (null (fboundp (cadr expr))))
	    (error "You're trying to replace a lisp function")
	  (append (list (list 'LABEL (cadr expr)))
		  (step1 (cadddr expr) 
			 (make-env (caddr expr) (length (caddr expr)))
			 funcnames
			 (cadr expr)
			 )
		  (list '(RTN))))))
     
     ;;Ajouter un cas QUOTE 

     ((and (search "prog" (string (car expr)))
	   (< (length (car expr) 6));;very big cond since we need to allow user defined func with another name
	   (or (equal (char (string (car expr)) 5) \#n);;progn
	       (equal (parse-integer (char (string (car expr))) 5) 1);;prog1
	       (equal (parse-integer (char (string (car expr))) 5) 2)));;prog2
      (append 
       (if (equal (char (string (car expr) 5) \#n))
	   (compile-progx (cdr expr) 0 (- (lenght (cdr expr)) 1) env funcnames)
	 (if (equal (parse-integer (char (string (car expr))) 5) 1)
	     (compile-progx (cdr expr) 0 0 env funcnames);;prog1
	   (compile-progx (cdr expr) 0 1 env funcnames)));;prog2
       '(POP R0)));;res of progx in R0
     (t
      (progn 
	;;(print "funcall")
	(append (compile-args (cdr expr) env funcnames);funcall
		(if (eq (car expr)
			currentFunc);;eligible for terminal recursivity
		    (progn 
		      ;;(print "pouet")
		      (append
		       (compile-terminal-recursivity 1 (length expr));;nbarg+1
		       (list (list 'JMP (car expr)))
		       ))
		     
		  (if (list_assoc_search funcnames (car expr));user define func	
		      (if (/= (cdr (list_assoc_search funcnames (car expr)))
			      (length (cdr expr)))
			  (error "call ~s doesn't have the right number of arguments" (car expr))
			(list 
			 '(MOVE FP R1)		     
			 '(MOVE SP FP)
			 (list 'MOVE (- (length expr) 1) 'R0)
			 '(PUSH R0)
			 '(MOVE SP R2)
			 (list 'SUB (length expr) 'R2);Enleve n+1 arguments
			 '(PUSH R2)
			 '(PUSH R1)
			 (list 'JSR (car expr))
			 '(POP R1)
			 '(POP R2)
			 '(MOVE R1 FP)
			 '(MOVE R2 SP)))
		    (if (equal (car expr) '+);;operator+
			(append 
			 (list 
			  '(POP R1)
			  '(POP R0)
			  '(ADD R1 R0))
			 (compile-op 'ADD (- (length expr) 3)));;minus the 3 arguments (+ x y), only generate anything if operator is used as a variadic operator

		      (if (equal (car expr) '-);;operator-
			  (append 
			   (list 
			    '(POP R1)
			    '(POP R0)
			    '(SUB R1 R0))
			   (compile-op 'SUB (- (length expr) 3)));;minus the 3 arguments (+ x y), only generate anything if operator is used as a variadic operator

			(if (equal (car expr) '*);;operator*
			    (append 
			     (list 
			      '(POP R1)
			      '(POP R0)
			      '(MUL R1 R0))
			     (compile-op 'MUL (- (length expr) 3)));;minus the 3 arguments (+ x y), only generate anything if operator is used as a variadic operator

			  (if (equal (car expr) '/);;operator/
			      (append 
			       (list 
				'(POP R1)
				'(POP R0)
				'(DIV R1 R0))
			       (compile-op 'DIV (- (length expr) 3)));;minus the 3 arguments (+ x y), only generate anything if operator is used as a variadic operator
			    
			    
			    
			    (list (list (car expr) (- (length expr) 1)));;we allow that a function isn't defined in the lisp vm but will be at runtime.
			    )))))))))
     
     )))

(defun compile-terminal-recursivity 
  (numArg nbArg)
  (if (= numArg nbArg)
      nil
    (append (list 
	     '(POP R0)
	     '(MOVE FP R1)
	     (list 'SUB numArg 'R1)
	     '(STORE R0 R1))
	    (compile-terminal-recursivity (+ numArg 1) nbArg)
	    )))
    

(defun compile-op (op nb-arg)
  (if (equal nb-arg 0)
      nil
    (append (list '(POP R1)
		  (list op 'R1 'R0))
		  (compile-op op (- nb-arg 1)))))


(defun compile-func (list definedfunc) 
  (if (null list)
      nil
    (append (step1 (car list) '() definedfunc nil)
	    (compile-func (cdr list) definedfunc)
  )))

(defun compile-main (list definedfunc)
  (if (null list)
      nil
    (append (step1 (car list) '() definedfunc nil)
	    (list '(PRINT))
	    (compile-main (cdr list) definedfunc))))

(defun compile-fichier (file) 
  (compile-parsed-file (separate-defun-main 
			(file-to-list file) 
			'() 
			(list_assoc_make) 
			'())))

(defun compile-cleanup (assembly)
  ;; (progn (print assembly)
  (cond ((null assembly)
	 nil)
	((null (cdr assembly))
	 assembly)
      ;;removing stuff here
	((and (eq (caar assembly) 'PUSH)
		(eq (caadr assembly) 'POP))
	 
	  (if (eq (cadar assembly) (cadadr assembly));;same register?
	      (compile-cleanup (cddr assembly));;remove those instructions
	    (cons (list 'MOVE (cadar assembly) (cadadr assembly)) (compile-cleanup (cddr assembly))));;morph to a move
	  )
      ;;cas général
	 (t
	  (cons (car assembly) (compile-cleanup (cdr assembly))))))

 
(defun compile-parsed-file (list) 
  (append
   (compile-func (car list) (cadr list))
   (list '(LABEL main))
   (compile-main (caddr list) (cadr list))
   (list '(HALT))))

;;(print (file-to-list "fibo.lisp"))

(defun write-compiled-file (filename newfilename)
  (with-open-file 
   (str newfilename
	:direction :output 
	:if-exists :supersede 
	:if-does-not-exist 
	:create)
   (let ((var (print (compile-cleanup (compile-fichier filename)))))
     (loop while
	   var
	   do 
	   (progn
	     (format str "~S" (car var))
	     (setf var (cdr var)))))))


(defun launch-compilation () 
  (print "Quel fichier voulez vous compiler?")
  (write-compiled-file (read) 
		       (progn 
			 (print "Dans quel fichier voulez vous mettre le code compilé?")
			 (read))))

(write-compiled-file "fibo.lisp" "fibo.livm") 
;;(launch-compilation)
