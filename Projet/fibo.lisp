
;; (defun fact (n) 
;;   (if (= n 0)
;;       1
;;     (* n (fact (- n 1)))))

(defun fibo (n)
  (if (= n 0)
      1
    (if (= n 1)
	1
      (+ (fibo (- n 1)) (fibo (- n 2)) 1))))
  
;;(fact 4)
(fibo 5)
