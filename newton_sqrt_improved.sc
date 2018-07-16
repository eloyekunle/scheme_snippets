(define (sqrt-iter guess last-guess x)
        (if (good-enough? guess last-guess x)
            guess
            (sqrt-iter (improve guess x)
			guess
                        x)))

(define (good-enough? guess last-guess x)
  (< (abs (- guess last-guess)) (/ guess 10000)))

(define (average x y)
  (/ (+ x y) 2))

(define (improve guess x)
  (average guess (/ x guess)))

(define (sqrt x)
  (sqrt-iter 1.0 0 x))

(sqrt 0.00016)
