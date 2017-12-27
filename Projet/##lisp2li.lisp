(defun fact (n)
  (cond
   ((= n 0) 1 (* n (fact(- n 1))))))

;(:IF(:CALL = (:VAR.1) (:LIT.0))
;(:LIT.1)
;(:CALL * (:VAR.1)(:UNKNOW (:CALL - :VAR.1 :LIT.1)))


(defun checklisp2li (expr-lisp env expr-li)
  (if(not(equal expr-li (lisp2li expr-lisp env)))
      (warn "BUG" expr-lisp env expr-li) 
      ))

;fonction trouver sur cours
(defun get-defun (symb)
  (get symb :defun))

(defun set-defun(symb expr)
  (setf (get symb :defun) expr))


(defun map-lisp2li (expr env)
  (if (atom expr)
	  '()
	;Construit la liste des valeurs retournees par lisp2li
	;sur chaque element de expr
	(cons (lisp2li (car expr) env) (map-lisp2li (cdr expr) env))
))

;fonction créant un env à une variable
(defun make-stat-env (args pos)
  (if (null args)
      ()
    (if (atom args)
	(cons args pos)
      (cons (make-stat-env (car args) pos) (make-stat-env (cdr args) (+ 1 pos))))))



(defun lisp2li (expr env)
  (if (atom expr)
      ;Si atom 
      (if(constantp expr)
	  ;Si constante
	  (cons :CONST expr)
          ;Construction de :const
	(let ((pos (position expr env)))
	  ;Sinon voir si expr est une variable d'env création d'une variable pos
	  (if(equal pos NIL)
      	  ;Si pos est nulle alors probleme
	      (progn(warn "variable inconnue")(cons :WARN expr))
	    ;Sinon pos est bien une variable d'env
	    (cons :VAR(+ p 1)))))
    ;Si pas atom alors (c'est une liste) 
    (let ((fun (car expr))    ;1er element de la liste qui est le nom de la fonction 
	  (args(cdr expr)))   ;suite de la liste qui sont les arguments de la fonction
      (cond
      ;Cas du QUOTE
       ((eq 'quote fun)
	(cons :CONST (car args)))

      ;Cas du IF
       ((eq 'if fun)
	(cons :IF (map-lisp2li args env)))

      ;Cas du UNKNOWN
       ((and (not (fboundp fun))
	     (not (get fun :defun)))
	(cons :UNKOWN (cons expr env)))

      ;Cas du LET
	((eq 'let fun)
	 (cons :LET (cons (length args)(map-lisp2li args env))))

      ;Cas du PRINT
	((eq 'print fun)
	 (cons :PRINT (map-lisp2li args env)))

      ;Cas du DEFUN
	((eql 'defun fun)
	 (lisp2li (list 'set-defun (list 'quote (second expr))  
			(list 'quote (cons (+ 1 (length (third expr)))
					   (if (cddddr expr)
					       (cons :PROGN (map-lisp2li (cdddr expr) (make-stat-env (third expr) 1)))
					     (lisp2li (cadddr expr) (make-stat-env (third expr) 1 ))))))
		  ()))

      ;Cas du MCALL
	

	
      ;Cas du CALL (défault)
       (t
	(cons :CALL ;Apelle
	      (cons fun (map-lisp2li args env)))) ;fonction et map-lisp2li sur les args
       ))))
