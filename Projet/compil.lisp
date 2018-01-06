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
			     (if (null (list_assoc_search funcnames (cddar expr)))
				 (list_assoc_add funcnames (cadar expr) 0);add list funcname
			       (error "Function defined at least twice")) 
			     main)
      (separate-defun-main (cdr expr) def funcnames (cons (car expr) main)))))

(setf label 0)
(defun next_label ()
  (setf label (+ label 1)))

(defun compile-args (list-arg env funcnames)
  (if (null list-arg)
      nil
    (append (step1 (car list-arg) env funcnames)
	    (list '(PUSH R0))
	    (compile-args (cdr list-arg) env funcnames))))

(defun make-env (list-arg nb-arg)
  (if (eq 0 nb-arg)
      nil
    (cons (cons (car list-arg) nb-arg) (make-env (cdr list-arg) (- nb-arg 1)))))


(defun step1 (expr env funcnames)
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
	(append (step1 (cadr expr) env funcnames)
		(list '(CMP R0 nil))
		(let ((else (next_label))
		      (end (next_label)))
		  
		  (append
		   (list 
		    (if (not (null (cadddr expr)))
			(list 'JEQ else)
		      (list 'JEQ end)))
		   (step1 (caddr expr) env funcnames)
		   
		   (if (not (null (cadddr expr)))
		       (append (list (list 'JMP end)
				     (list 'LABEL else))
			       (step1 (cadddr expr) env funcnames)))
		   (list (list 'LABEL end)))))))

     ((equal (car expr) 'defun)
      (progn 
	;;(print "defun")    
	(if (not (null (fboundp (cadr expr))))
	    (error "You're trying to replace a lisp function")
	  (append (list (list 'LABEL (cadr expr)))
		  (step1 (cadddr expr) 
			 (make-env (caddr expr) (length (caddr expr)))
			 funcnames)
		  (list '(RTN))))))
     
     ;;Ajouter un cas QUOTE 
     
     (t
      (progn 
	;;(print "funcall")
	(append (compile-args (cdr expr) env funcnames);funcall
		(if (list_assoc_search funcnames (car expr));user define func		
		    (list (list 'MOVE (- (length expr) 1) 'R0)
			  '(PUSH R0)
			  '(MOVE FP R1)
			  '(MOVE SP FP)
			  '(MOVE SP R2)
			  (list 'SUB (length expr) 'R2);Enleve n+1 arguments
			  '(PUSH R2)
			  '(PUSH R1)
			  (list 'JSR (car expr))
			  '(POP R1)
			  '(POP R2)
			  '(MOVE R1 FP)
			  '(MOVE R2 SP))
		  (list (list (car expr) (- (length expr) 1)))
		  ))))
      
     )))
  

(defun compile-func (list definedfunc) 
  (if (null list)
      nil
    (append (step1 (car list) '() definedfunc)
	    (compile-func (cdr list) definedfunc)
  )))

(defun compile-main (list definedfunc)
  (if (null list)
      nil
    (append (step1 (car list) '() definedfunc)
	    (list '(PRINT))
	    (compile-main (cdr list) definedfunc))))

(defun compile-fichier (file) 
  (compile-parsed-file (separate-defun-main 
			(file-to-list file) 
			'() 
			(list_assoc_make) 
			'())))

(defun compile-parsed-file (list) 
  (append
   (compile-func (car list) (cadr list))
   (list '(LABEL main))
   (compile-main (caddr list) (cadr list))
   (list '(HALT))))

;(print (file-to-list "fibo.lisp"))

;;(defun separate-defun-main (expr def funcnames main)
;; (print (compile-parsed-file (separate-defun-main 
;; 			     (file-to-list "fibo.lisp") 
;; 			     '()
;; 			     (list_assoc_make)
;; 			     '())))


(print (compile-fichier "fibo.lisp"))

;(print (step1 '(defun f '() 5) '() '()))



;; ;(with-open-file (str "./file.lispvm"
;;                      :direction :output
;;                      :if-exists :supersede
;;                      :if-does-not-exist :create)
		
;; 		(format str ))

;; (defun write-code-vm (file code)
;;   (write-code-vm-rec (open file :if-does-not-exist :create) code))

;; (defun write-code-vm-rec (file code)
;;   (if (null code)
;;       (close file)
;;     (progn (write file (car code))
;; 	   (write-code-vm-rec (cdr code)))))

;; (write-code-vm "compil.lvm" (cdr z))
