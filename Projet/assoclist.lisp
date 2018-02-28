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

;;;;;;Shamefully false. We probably won't work on it more since it's unlikely we do the let/progx interaction
(defun list_assoc_max_aux (la cmax);;for environement creation purpose
  (if (null la)
      cmax
    (list_assoc_max_aux (cdr la) (max (cdar la) cmax))))

(defun list_assoc_max (la)
  (if (null la)
      0
    (list_assoc_max_aux (cdr la) (cdar la))))

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

    (print (list_assoc_max l))
    
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
