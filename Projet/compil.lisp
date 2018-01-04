(defun file-to-list (filename)
  (get-file-lisp (open filename nil nil) '()))

(defun get-file-lisp (file expr)
  (let ((x (read file)))
    (if (null x);EOF
	expr
      (get-file-lisp file (cons (x) expr)))))
  
(defun separate-defun-main (expr def main)
  (if (null expr)
      (cons def main)
    (if (eq (caar expr) 'defun)
	(step2 (cdr expr) 
	       (if (null (list_assoc_search def (cadar expr)))
		   (list_assoc_add expr (cadar expr) cddar);add list funcname body
		 (error "Function defined at least twice")) main)
      (step2 (cdr expr) def (cons (car expr) main)))))
