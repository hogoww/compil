(load "assoclist.lisp")

(defun file-to-list (filename)
  (get-file-lisp (open filename) '()))

(defun get-file-lisp (file expr)
  (let ((x (read file nil)))
    (if (null x);EOF
	expr
      (get-file-lisp file (cons x expr)))))
  
(defun separate-defun-main (expr def main)
  (if (null expr)
      (cons def main)
    (if (eq (caar expr) 'defun)
	(progn
	  ;(print (cddar expr))
	  (separate-defun-main (cdr expr) 
	       (if (null (list_assoc_search def (cddar expr)))
		   (list_assoc_add def (cadar expr) (cddar expr));add list funcname body
		 (error "Function defined at least twice")) main))
      (separate-defun-main (cdr expr) def (cons (car expr) main)))))

(setf y (file-to-list "compil.lisp"))

(setf z (separate-defun-main y (list_assoc_make) '()))
(list_assoc_print (cdr z))


(setf label 0)
(defun next_label ()
  (setf label (+ label 1)))

(defun compile-args (list-arg env)
  (if (null list-arg)
      nil
      (append (step1 (car list-arg) env) 
	      (list '(PUSH R0))
	      (compile-args (cdr list-arg) env))))
    

(defun make-env (list-arg nb-arg)
  (if (eq 0 nb-arg)
      nil
    (cons (const (car list-arg) nb-arg) (make-env (cdr list-arg) (- nb-arg 1)))))
  

(defun step1 (expr env)
  (cond 
   ((atom expr) 
    (if (constantp expr)
	(cons (cons (cons 'MOVE expr) 'R0) nil)
      (let ((a (list_assoc_search env expr)))
	(if (not (null a))
	    (list '(MOVE FP R0)
		  (list 'SUB (cadr a) 'R0);(cdr a) position dans la liste d'arguments de la func
		  '(LOAD R0 R0))
	  (error "~s Variable doesn't exist." expr)
	  ))))
   ;; ((atom (car expr) ;si 
   ((equal (car expr) 'if) (append (step1 (cadr expr) env)
				   (list '(CMP R0 nil))
				   (let ((else (next_label))
					 (end (next_label)))
				     
				     (append
				      (list 
				       (if (not (null (cadddr expr)))
					   (cons 'JEQ else)
					 (cons 'JEQ end)))
				      (step1 (caddr expr) env)
				      
				      (if (not (null (cadddr expr)))
					  (append (list (cons 'JMP end)
						  (cons 'label else))
						  (step1 (cadddr expr) env)))
				      (list (cons 'label end))))))
   ((equal (car expr) 'defun) (if (not (null (fbounp (cadr expr))))
				  (error "You're trying to replace a lisp function")
				(append (list (cons 'label (cadr expr)))
					(step1 (cadddr expr) (make-env (caddr expr)))
					(list '(RTN)))))
  
					;Ajouter un cas QUOTE 

   (t (append (compile-args (cdr expr) env);funcall
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
		    '(MOVE R2 SP))))

   ))



(print (step1 '(+ f 2) (list '(f 1))))

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
