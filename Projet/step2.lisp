(defun step2 (expr def main)
  (if (null expr)
      (cons def (invert main)
    (if (eq (caar expr) 'defun)
	(step2 (cdr expr) 
	       (if (null (list_assoc_search def (cadar expr)))
		   (list_assoc_add expr (cadar expr) cddar);add list funcname body
		 (error "Function defined at least twice")) main)
      (step2 (cdr expr) def (cons (car expr) main)))))
					
