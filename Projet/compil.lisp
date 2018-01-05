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


(defun step (expr pos env)
  (cond 
   ((atom expr) 
    (if (constantp expr)
	(cons (cons 'MOVE expr) 'R0)	
      (let ((a (list_assoc_search env expr)))
	(if (a)
	    (list '(MOVE FP R0)
		  (cons (cons 'SUB (cdr a)) 'R0);(cdr a) position dans la liste d'arguments de la func
		  '(LOAD R0 R0))
	  (error "~s Variable doesn't exist." expr)
	  ))))
   ;; ((atom (car expr) ;si 
   ((equal (car expr) 'if) (append (step (cadr expr) env)
				   '(CMP R0 nil)
				   (let ((else (next_label))
					 (end (next_label)))
				     
				     (append 
				      (if (cadddr expr)
					  (cons 'JEQ else)
					(cons 'JEQ end))
				      (step (caddr expr) env)
				      
				      (if (cadddr expr)
					  (append (cons 'JMP end)
						  (cons 'label else)
						  (step (cadddr expr) env)))
				      (cons 'label end)))))
   ((equal (car expr 'defun)) (if (fbounp (cadr expr))
				  (error "You're trying to replace a lisp function")
				(append (cons 'label (cadr expr))
					(step (cadddr expr) (make-env (caddr expr)))
					'(RTN))))

					;Ajouter un cas QUOTE 

   (t (append (compile-args (cdr expr) env)
	      (cons (cons 'MOVE (- (length expr) 1)) 'R0)
	      '(PUSH R0)
	      '(MOVE FP R1)
	      '(MOVE SP FP)
	      '(MOVE SP R2)
	      (cons (cons 'SUB (length expr)) 'R2);Enleve n+1 arguments
	      '(PUSH R2)
	      '(PUSH R1)
	      (cons 'JSR (car expr))
	      '(POP R1)
	      '(POP R2)
	      '(MOVE R1 FP)
	      '(MOVE R2 SP)))
		    
	      
				      
   
   ))

(defun compile-args (list-arg env)
  (if (list-arg)
      (append (step (car list-arg)) 
	      '(PUSH R0)
	      (compile-args (cdr arg) env))
    nil))



(print (step '(f 1) '((f 1))))

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
