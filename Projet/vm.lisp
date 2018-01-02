(load "assoclist.lisp")

(setf STACK_SIZE 5) ;temp, till we actually load things and stuff
(setf HEAP_SIZE 5)
(setf MAIN_ADRESS 12) ;adress of the first instruction to eval

(setf DPG 1)
(setf DEQ 0)
(setf DPP -1)

(defun make-vm (symb name)
  (prog1 (setf symb (make-symbol name))
    (setf (get symb 'VM) symb)
    (setf (get symb 'name) name)    

    ;Print what the vm contains
    (setf (get symb 'print-vm);Will print the memory too, which ain't that good...
	  (lambda ()
	    (print (symbol-plist symb))))

    (setf (get symb 'print-memory);Will print the memory too, which ain't that good...
	  (lambda ()
	    (print (get symb 'MEM))))

		
    (setf (get symb 'print-property);print property value
	  (lambda (prop)
	    (prog1 (print (get symb prop))
	      (print prop))))

    ;private func
    (setf (get symb 'get-register)
	  (lambda (prop)
	    (get symb prop)))
    
    (setf (get symb 'set-register)
	  (lambda (prop value)
	    (setf (get symb prop) value)
	    ))

    (setf (get symb 'get-addr)
	  (lambda (addr) (aref (get symb 'MEM) addr)))
    
    (setf (get symb 'set-addr)
	  (lambda (addr value)
	    (setf (aref (get symb 'MEM) addr) value)))
    
    ;; (setf (get symb 'code-end)
    ;; 	  (lambda ()
    ;; 	    (funcall (get symb 'get-addr) 0)
    ;; 	    ))
    
    ;; (setf (get symb 'heap-start)
    ;; 	  (lambda ()
    ;; 	    (- (funcall (get symb 'code-end)) 1)))

    ;; (setf (get symb 'heap-end)
    ;; 	  (lambda ()
    ;; 	    (+ (- (funcall (get symb 'code-end)) 1) ) HEAP_SIZE))

    (setf (get symb 'literalOrRegister)
	  (lambda (v);if V is a literal, return the literal, otherwise return the register
	    (if (integerp v)
		v
	      (funcall (get symb 'get-register) v)
	      )))

    (setf (get symb 'pop_to_list) 
	  (lambda (nb_arg) 
	    (if (equal 0 nb_arg)
		nil
	      (cons (progn (funcall (get symb 'POP) 'R0)
			   (funcall (get symb 'get-register) 'R0))
		    (funcall (get symb 'pop_to_list) (- nb_arg 1))))))
    

    (setf (get symb 'labels) (list_assoc_make))
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    (setf (get symb 'file) "file.txt");;Change to function args!
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    (let* ((flow (open (get symb 'file)));;we could add the error handling
	  (nb-label (parse-integer (read-line flow)));;here too
	  (code-size (parse-integer (read-line flow)));;here too
	  (num-label 0)
	  (num-instruct 1))
      (setf (get symb 'memory-size) (+ code-size STACK_SIZE HEAP_SIZE))
      (setf (get symb 'MEM) (make-array (get symb 'memory-size)))
      (loop while (< num-label nb-label)
	    do
	    (let ((lab (read flow)))
	      (progn (setf (get symb 'labels) (list_assoc_add (get symb 'labels) (cadr lab) (caddr lab)))
		     (setf num-label (+ num-label 1))
		     )))
      (loop while (<= num-instruct code-size);to do memory-size-1 at the start, so no out of bound
	    do
	    (funcall (get symb 'set-addr)
		     (- (get symb 'memory-size) num-instruct)
		     (read flow))
	    (setf num-instruct (+ num-instruct 1)))
      (close flow)
      )
    
    
    (setf (get symb 'BP) 0);no variable for now.

    (setf (get symb 'SP) 0)
    (setf (get symb 'FP) 0)

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
	    (funcall (get symb 'set-register)
		   dest
		   (funcall (get symb 'literalOrRegister) target))))
    
    (setf (get symb 'LOAD) 
	  (lambda (addr R)
	    (funcall (get symb 'set-register)
		     R 
		     (get symb 'get-addr) addr)))
  
    (setf (get symb 'STORE) 
	  (lambda  (reg addr)
	    (funcall (get symb 'set-addr) 
		     addr 
		     (funcall (get symb 'get-register) reg))))

    (setf (get symb 'ADD) 
	  (lambda (target dest)
	    (funcall (get symb 'set-register) 
		     dest
		     (+ 
		      (funcall (get symb 'literalOrRegister) target)
		      (funcall (get symb 'get-register) dest)))))
    
    (setf (get symb 'SUB) 
	  (lambda (target dest)
	    (funcall (get symb 'get-register) dest) 
		  (- (funcall (get symb 'literalOrRegister) target) (funcall (get symb 'get-register) dest))))

    (setf (get symb 'MUL) 
	  (lambda (target dest)
	    (funcall (get symb 'set-register) 
		     dest
		     (* (funcall (get symb 'get-register) target) (funcall (get symb 'get-register) dest)))))
    
    (setf (get symb 'DIV) 
	  (lambda (target dest)
	    (funcall (get symb 'set-register) 
	       dest
	       (if (equal (funcall (get symb 'get-register) dest) 0)
		   (error "error div by 0")
		 (/ (funcall (get symb 'get-register) target) (funcall (get symb 'get-register) dest))))))
    
    (setf (get symb 'PUSH) 
	  (lambda  (R value)
	    (progn (funcall (get symb 'set-addr)
			    (funcall (get symb 'get-register) 'SP) value)
		   (funcall (get symb 'set-register) 
			    'SP 
			    (+ (funcall (get symb 'get-register) 'SP) 1)))))
    
    (setf (get symb 'POP) 
	  (lambda (R)
	    (prog1 
		(funcall (get symb 'get-register) 'SP)
	      (funcall (get symb 'set-register) 
		       'SP 
		       (- (funcall (get symb 'get-register) 'SP) 1)))))
    
    (setf (get symb 'CMP)
	  (lambda (R1 R2); check if the order of the flag is ok
	    (if (equal (funcall (get symb 'get-register) R1) (funcall (get symb 'get-register) R2))
		(funcall (get symb 'set-register) 'FLG DEQ);R1==R2
	      (if (> (funcall (get symb 'get-register) R1) (funcall (get symb 'get-register) R2))
		  (funcall (get symb 'set-register) 'FLG DPG); R1 > R2
		(funcall (get symb 'set-register) 'FLG DPP))))); R1 < R2 
    
    (setf (get symb 'JPG) 
	  (lambda (etiq)
	    (if (equal (funcall (get symb 'get-register) 'FLG) DPG)
		(funcall (get symb 'JMP) etiq))))
    
    (setf (get symb 'JEQ) 
	  (lambda (etiq)
	    (if (equal (funcall (get symb 'get-register) 'FLG) DEQ)
		(funcall (get symb 'JMP) etiq))))
    
    (setf (get symb 'JPP ) 
	  (lambda (etiq)
	    (if (equal (funcall (get symb 'get-register) 'FLG) DPP)
		(funcall (get symb 'JMP) etiq))))

    (setf (get symb 'JGE) 
	  (lambda (etiq)
	    (if (or (equal (funcall (get symb 'get-register) 'FLG) DPG) (equal (funcall (get symb 'get-register) 'FLG) DEQ))
		(funcall (get symb 'JMP) etiq))))
    
    (setf (get symb 'JPE) 
	  (lambda (etiq)
	    (if (or (equal (funcall (get symb 'get-register) 'FLG) DPE) (equal (funcall (get symb 'get-register) 'FLG) DEQ))
		(funcall (get symb 'JMP) etiq))))
    
    (setf (get symb 'JMP) 
	  (lambda (etiq)
	    (funcall (get symb 'set-register)
		     PC 
		     (+ 1 etiq))))

    (setf (get symb 'JSR) 
	  (lambda (etiq)
	    (funcall (get symb 'PUSH) (funcall (get symb 'get-register) RA));push
	    (funcall (get symb 'JMP) etiq)))

    (setf (get symb 'RTN)
	  (lambda (etiq)
	    (funcall (get symb 'POP) 
		     (funcall (get symb 'get-addr) (funcall (get symb 'get-register) 'SP))
		     'PC)))
    
    (setf (get symb 'NOP)
	  (lambda ()));to do

    (setf (get symb 'HALT)
	  (lambda ()));To do

    (setf (get symb 'CONS) 
	  (lambda (v R2);cons ;;v can be a value or a register
	    (funcall (get symb 'set-register) R2 
		     (cons (funcall (get symb 'literalOrRegister) v))
		     (funcall (get symb 'get-register) R2))))

    (setf (get symb 'CAR) 
	  (lambda (target dest);car
	    (funcall (get symb 'set-register) 
		     dest
		     (car (funcall (get symb 'get-register) target)))))

    (setf (get symb 'CDR) 
	  (lambda (target dest);cdr
	    (funcall (get symb 'set-register) 
		     dest
		     (cdr (funcall (get symb 'get-register) target)))))

    (setf (get symb 'PRIMIVITE)
	  (lambda (funcname nb_arg)
	    (set-register 'R0 (apply funcname (funcall (get symb 'pop_to_list) nb_arg)))
	    ))
    
    (setf (get symb 'run)
	  (lambda ()
	    (let ((instruct (funcall (get symb 'get-addr) (get symb 'PC))))
	      (loop while (not (equal (car instruct) 'HALT))
		    do
		    (print instruct)
		    (funcall (get vm 'print-property) (cadr instruct))
		    (funcall (get vm 'print-property) (caddr instruct))
		    (case (Length instruct)
		      ((1) (funcall (get symb (car instruct))))
		      ((2) (if (get symb (car instruct)) 
			       (funcall (get symb (car instruct)) (cadr instruct))
			     (funcall (get symb 'PRIMIVITE) (car instruct) (cadr instruct))))
		      ((3) (funcall (get symb (car instruct)) (cadr instruct) (caddr instruct))))
		      
		    (funcall (get symb 'set-register) 'PC (- (funcall (get symb 'get-register) 'PC) 1))
		    (setf instruct (funcall (get symb 'get-addr) (get symb 'PC)))))))
    ))


(setf vm (make-vm 'VM "VM0"))


;; (funcall (get vm 'print-property) 'R1)
;; (funcall (get vm 'print-property) 'R2)
;; (funcall (get vm 'MOVE) 'R2 'R1)
;; (funcall (get vm 'print-property) 'R1)
;; (funcall (get vm 'print-property) 'R2)

;(funcall (get vm 'print-property) 'labels)
(funcall (get vm 'print-property) 'memory-size)
(funcall (get vm 'run))


(funcall (get vm 'print-property) 'R1)
(funcall (get vm 'print-property) 'R2)
