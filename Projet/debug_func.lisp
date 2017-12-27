(setq v (make-array 3)) ; creation du vecteur
(setf (aref v 0) 1) ; v[0]:= 1
(setf (aref v 1) 22)
(setf (aref v 2) 315)

(defun print-register (name value)
   (format t "Register:~S=~S~%" name value)
	       )

(defun print-memory (v size)
  (let ((iterator 0))
    (loop while (< iterator size)
	  do (if(not(null (aref v iterator)))
		 (format t "Elm[~S]=~S~%" iterator (aref v iterator))
	       )
	       (setq iterator (+ iterator 1)))))

(print-memory v 3)
(print-register "coco" 2)
