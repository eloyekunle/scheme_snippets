(define (compute-f x)
  (compute-f-iterative 2 1 0 x))

(define (compute-f-iterative a b c count)
  (if (= count 0)
      c
      (compute-f-iterative (+ a (* b 2) (* c 3))
			   a
			   b
			   (- count 1))))

(compute-f 0)
(compute-f 1)
(compute-f 2)
(compute-f 3)
(compute-f 4)
(compute-f 5)
(compute-f 6)
(compute-f 7)
(compute-f 200008)
