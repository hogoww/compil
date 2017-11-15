(setf STACK_SIZE 500)
(setf MAIN_ADRESS 12) ;adress of the first instruction to evaluate
(setf GETLINE 20) ;first line of compiled file must be the number of code line we have to load


(defun get-register (name symb)
  (get name symb)
)

(defun make-vm (name)
  (make-symbol name)
  (setf (get name 'BP) (+ GETLINE 1))
  (setf (get name 'SP) (symbol-plist 'BP))
  (setf (get name 'MEM) (+ (get-register name 'BP) STACK_SIZE))
  (setf (get name 'FP) nil)
  
  (setf (get name 'R0) 0)
  (setf (get name 'R1) 0)
  (setf (get name 'R2) 0)
  (setf (get name 'RA) nil)
  
  (setf (get name 'FLG) nil)

  (setf (get name 'PC) MAIN_ADRESS)
)



(setf VM 'beautiful-vm)
(make-vm 'beautiful-vm)

(print (symbol-plist 'VM))
(print (get-register 'VM 'FLG))
