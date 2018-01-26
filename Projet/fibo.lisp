
;; (defun fact (n)
;;   (if (= n 0)
;;       1
;;     (* n (fact (- n 1)))))
;; (fact 4)

;; (defun fact (n acc) 
;;    (if (= n 0)
;;        acc
;;      (fact (- n 1) (* acc n))))
;; (fact 4 1)


(defun fibo2 (term val prev)
  (if (= term 0) 
      prev
    (if (= term 1)
	(+ val prev)
      (fibo2 (- term 1) (+ val prev) val))))

(defun fiboT (term)
  (fibo2 term 1 0))

(fiboT 5)

;; (defun fibo (n)
;;   (if (= n 0)
;;       1
;;     (if (= n 1)
;; 	1
;;       (+ (fibo (- n 1)) (fibo (- n 2))))))
;; (fibo 5)
;;(/ 12 2 3 2)
