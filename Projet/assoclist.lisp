(defun list_assoc_make () nil)

(defun list_assoc_search (la key);;return the corresponding pair
  (if (null la)
      nil
    (if (equal key (caar la))
	(car la)
      (list_assoc_search (cdr la) key))))

(defun list_assoc_add (la key value);;add or change value corresponding to the key
  (if (null la)
      (cons (cons key value) nil)
    (if (null (cdr la))
	(cons (car la) (cons (cons key value) nil))
      (if (equal key (caar la))
	  (cons (cons key value) (cdr la))
	(cons (car la) (list_assoc_add (cdr la) key value))))))
	

(defun list_assoc_rm (la key)
  (if (null la)
      nil;;we don't signal an error, must keep running
    (if (equal (caar la) key)
	(cdr la)
      (cons (car la) (list_assoc_rm (cdr la) key)))))

(defun list_assoc_min (la cmin)
  (if (null la)
      cmin
    (list_assoc_min (cdr la) (min (car la) cmin))))

(defun list_assoc_print (la)
  (print la))

(defun list_assoc_test_case_1 ()
  (progn 
    (setf l (list_assoc_make))
    (list_assoc_print l)
    (setf l (list_assoc_add l "1" 3))
    (list_assoc_print l)
    (setf l (list_assoc_add l "2" 4))
    (list_assoc_print l)
    (setf l (list_assoc_add l "3" 2))
    (list_assoc_print l)
    (setf l (list_assoc_add l "4" 2))
    (list_assoc_print l)
    (setf l (list_assoc_add l "5" 2))
    (list_assoc_print l)
    (setf l (list_assoc_add l "6" 2))

    (list_assoc_print l)
    (setf l (list_assoc_rm l "5"))
    (setf l (list_assoc_rm l "6"))
    (setf l (list_assoc_rm l "3"))
    (list_assoc_print l)
    (setf l (list_assoc_rm l "1"))
    (list_assoc_print l)
    (setf l (list_assoc_rm l "2"))
    (list_assoc_print l)
    (setf l (list_assoc_rm l "4"))
    (list_assoc_print l)

    ))
