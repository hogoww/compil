(defun step2 (expr def main)
  (if (null expr)
      (progn (invert def)
	     (invert main)
	     (cons def main))
    (if (eq (caar expr) 'defun)
	(step2 (cdr expr) (cons (car expr) def) main)
      (step2 (cdr expr) def (cons (car expr) main)))))
					
