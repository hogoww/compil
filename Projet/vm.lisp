(setf STACK_SIZE 10) ;temp, till we actually load things and stuff
(setf MAIN_ADRESS 12) ;adress of the first instruction to evaluate
(setf GETNBLINE 20) ;first line of compiled file must be the number of code line we have to load

(setf DPG 1)
(setf DEQ 0)
(setf DPP -1)


;debug
(defun printvm ();affiche les valeurs contenues dans la VM
  (symbol-plist VM))

					;VM only func
(defun get-register (prop)
  (get VM prop);'VM is setf by make-vm.
  )


(defun set-register (prop value)
  (setf (get VM prop) value);'VM est setf par make-vm.
  )

(defun get-addr (addr)) ;Will be implemented at the same time as memory

(defun set-addr (addr value)) ;Will be implemented at the same time as memory

(defun literalOrRegister (v);if V is a literal, return the literal, otherwise return the register
  (if (integerp v) 
      v
    (get-register v)
    ))



;register operation 
;they should be passed as propriety of vm?
(defun move (target dest);targer register or integer. Dest register.
  (set-register dest
		(literalOrRegister target)))

(defun l(addr R);Load So we don't mess with lisp's LOAD
  (set-register R (get-addr addr)))

(defun store (reg addr)
  (set-addr addr (get-register reg)))

(defun add (R1 R2)
  (set-register R2
	(+ (get-register R1) (get-register R2))))

(defun sub (R1 R2)
  (setf (get-register R2) 
	(- (get-register R1) (get-register R2))))

(defun mul (R1 R2)
  (set-register R2
	(* (get-register R1) (get-register R2))))

(defun div (R1 R2)
  (set-register R2
		(if (equal (get-register R1) 0)
		    (print "error div by 0")
		  (/ (get-register R1) (get-register R2)))))


(defun p (R value);Push, so we don't mess with lisp one
  (setf (get-register SP) value)
  (set-register SP (+ (get-register SP) 1)))

(defun p1 (R);Pop, so we don't mess with lisp one
  (prog1 
      (get-register SP)
    (set-register SP (- (get-register SP) 1))))

(defun CMP (R1 R2); check if the order of the flag is ok
  (if (equal (literalOrRegister R1) (get-register R2))
      (set-register 'FLG DEQ)
    (if (> (literalOrRegister R1) (get-register R2))
	(set-register 'FLG DPG); R1 > R2
      (set-register 'FLG DPP)))); R1 < R2 

(defun JPG (etiq)
  (if (equal (get-register 'FLG) DPG)
      (JMP etiq)))

(defun JEQ (etiq)
  (if (equal (get-register 'FLG) DEQ)
      (JMP etiq)))
	
(defun JPP (etiq)
  (if (equal (get-register 'FLG) DPP)
      (JMP etiq)))

(defun JGE (etiq)
  (if (or (equal (get-register 'FLG) DPG) (equal (get-register 'FLG) DEQ))
      (JMP etiq)))

(defun JPE (etiq)
  (if (or (equal (get-register 'FLG) DPE) (equal (get-register 'FLG) DEQ))
      (JMP etiq)))

(defun JMP (etiq)
  (set-register PC etiq))

(defun JSR (etiq)
  (p (get-register RA));push
  (JMP etiq))

(defun RTN (etiq)
  (JMP (p1 (get-register))));pop

(defun NOP ())

(defun HALT ());To do

(defun C1 (R1 R2);cons
  (set-register R2 (cons (get-register R1) (get-register R2))))

(defun C2 (R);car
  (set-register R (car (get-register R1))))

(defun C3 (R);cdr
  (set-register R (cdr (get-register R1))))


(defun make-vm (name)
  (prog1 (setf VM (make-symbol name))

  (setf (get VM 'name) name)
  (setf (get VM 'BP) (+ GETNBLINE 1))
  (setf (get VM 'SP) (symbol-plist 'BP))
  (setf (get VM 'MEM) (make-array (+ (get-register 'BP) STACK_SIZE)))
  (setf (get VM 'FP) nil)
  
  (setf (get VM 'R0) 0)
  (setf (get VM 'R1) 0)
  (setf (get VM 'R2) 0)
  (setf (get VM 'RA) nil)
  (setf (get VM 'FLG) nil)

  (setf (get VM 'PC) MAIN_ADRESS)  
  ))

(set-register 'R1 12)


(setf VM (make-vm "VM0"))


(print (get-register 'PC))
