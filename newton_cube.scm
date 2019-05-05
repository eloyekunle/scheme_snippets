(define (cube x) (* x (square x)))
(define (cube-rt-iter guess x)
  (if (good-enough? guess x)
       guess
       (cube-rt-iter (improve guess x)
		      x)))

(define (good-enough? guess x)
  (< (abs (- (cube guess) x)) 0.00001))

(define (improve guess x)
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(define (cube-rt x)
  (cube-rt-iter 1.0 x))

(cube-rt 9)
