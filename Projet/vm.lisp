(setf STACK_SIZE 10) ;temp, till we actually load things and stuff
(setf MAIN_ADRESS 12) ;adress of the first instruction to evaluate
(setf GETNBLINE 5) ;first line of compiled file must be the number of code line we have to load

(setf DPG 1)
(setf DEQ 0)
(setf DPP -1)


;; ;debug
;; (defun printvm ();Print what the vm contains
;;   (print (symbol-plist VM)))

;; 					;VM only func
;; (defun get-register (prop)
;;   (get VM prop);'VM is setf by make-vm.
;;   )


;; (defun set-register (prop value)
;;   (setf (get VM prop) value);'VM est setf par make-vm.
;;   )

;; (defun get-addr (addr)) ;Will be implemented at the same time as memory

;; (defun set-addr (addr value)) ;Will be implemented at the same time as memory

;; (defun literalOrRegister (v);if V is a literal, return the literal, otherwise return the register
;;   (if (integerp v) 
;;       v
;;     (get-register v)
;;     ))



;; ;register operation 
;; ;they should be passed as propriety of vm?


(defun make-vm (symb name)
  (prog1 (setf symb (make-symbol name))

    ;Print what the vm contains
    (setf (get symb 'print-vm);Will print the memory too, which ain't that good...
	  (lambda ()
	    (print (symbol-plist symb))))
		
    (setf (get symb 'print-property);print property value
	  (lambda (prop)
	    (prog1 (print (get symb prop))
	      (print prop))))    

    ;private func
    (setf (get symb 'get-register)
	  (lambda (prop)
	    (get symb prop)
	    ))
    
    (setf (get symb 'set-register)
	  (lambda (prop value)
	    (setf (get symb prop) value)
	    ))
    

    (setf (get symb 'VM) symb)
    (setf (get symb 'name) name)
    (setf (get symb 'BP) (+ GETNBLINE 1))
    (setf (get symb 'SP) (symbol-plist 'BP))
    (setf (get symb 'MEM) (make-array (+ (get symb 'BP) STACK_SIZE)))
    (setf (get symb 'FP) nil)
    
    (setf (get symb 'R0) 0)
    (setf (get symb 'R1) 0)
    (setf (get symb 'R2) 0)
    (setf (get symb 'RA) nil)
    (setf (get symb 'FLG) nil)
    
    (setf (get symb 'PC) MAIN_ADRESS)

    ;Public func
    ;;register operation 

    (setf (get symb 'MOVE) 
	  (lambda (target dest);targer register or integer. Dest register.
	    (set-register dest
			  (literalOrRegister target))))
    
    (setf (get symb 'LOAD) (lambda (addr R)
      (set-register R (get-addr addr))))

    (setf (get symb 'STORE) (lambda  (reg addr)
      (set-addr addr (get-register reg))))

    (setf (get symb 'ADD) (lambda (R1 R2)
      (set-register R2
		    (+ (get-register R1) (get-register R2)))))

    (setf (get symb 'SUB) (lambda (R1 R2)
      (setf (get-register R2) 
	    (- (get-register R1) (get-register R2)))))

    (setf (get symb 'MUL) (lambda (R1 R2)
      (set-register R2
		    (* (get-register R1) (get-register R2)))))

    (setf (get symb 'DIV) (lambda (R1 R2)
      (set-register R2
		    (if (equal (get-register R1) 0)
			(print "error div by 0")
		      (/ (get-register R1) (get-register R2))))))


    (setf (get symb 'PUSH) (lambda  (R value)
      (setf (get-register SP) value)
      (set-register SP (+ (get-register SP) 1))))

    (setf (get symb 'POP) (lambda (R)
      (prog1 
	  (get-register SP)
	(set-register SP (- (get-register SP) 1)))))

    (setf (get symb 'CMP) (lambda (R1 R2); check if the order of the flag is ok
      (if (equal (literalOrRegister R1) (get-register R2))
	  (set-register 'FLG DEQ)
	(if (> (literalOrRegister R1) (get-register R2))
	    (set-register 'FLG DPG); R1 > R2
	  (set-register 'FLG DPP))))); R1 < R2 

    (setf (get symb 'JPG) (lambda (etiq)
      (if (equal (get-register 'FLG) DPG)
	  (JMP etiq))))

    (setf (get symb 'JEQ) (lambda (etiq)
      (if (equal (get-register 'FLG) DEQ)
	  (JMP etiq))))
    
    (setf (get symb 'JPP ) (lambda (etiq)
      (if (equal (get-register 'FLG) DPP)
	  (JMP etiq))))

    (setf (get symb 'JGE) (lambda (etiq)
      (if (or (equal (get-register 'FLG) DPG) (equal (get-register 'FLG) DEQ))
	  (JMP etiq))))

    (setf (get symb 'JPE) (lambda (etiq)
      (if (or (equal (get-register 'FLG) DPE) (equal (get-register 'FLG) DEQ))
	  (JMP etiq))))

    (setf (get symb 'JMP) (lambda (etiq)
      (set-register PC etiq)))

    (setf (get symb 'JSR) (lambda (etiq)
      (p (get-register RA));push
      (JMP etiq)))

    (setf (get symb 'RTN) (lambda (etiq)
      (JMP (p1 (get-register)))))

    (setf (get symb 'NOP) (lambda ()))

    (setf (get symb 'HALT) (lambda ()));To do

    (setf (get symb 'CONS) (lambda (R1 R2);cons
      (set-register R2 (cons (get-register R1) (get-register R2)))))

    (setf (get symb 'CAR) (lambda (R);car
      (set-register R (car (get-register R1)))))

    (setf (get symb 'CDR) (lambda (R);cdr
      (set-register R (cdr (get-register R1)))))

    ))


(setf vm (make-vm 'VM "VM0"))

(defun func-vm (funcName arg)
  (apply (get vm funcname) arg))

(func-vm 'print-property '(R1))
(func-vm 'set-register '(R1 12))
(func-vm 'print-property '(R1))
(func-vm 'get-register '(R1))
(func-vm 'print-vm '())
