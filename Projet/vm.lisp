(setf STACK_

(setf VM (gensym))
(print (symbol-plist VM))
(setf (get VM 'R0) 0)
(print (symbol-plist VM))
(setf (get VM 'R1) '1)
(print (symbol-plist VM))
(setf (get VM 'R2) '2)
(print (symbol-plist VM))
