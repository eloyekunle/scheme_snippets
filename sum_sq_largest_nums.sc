(define (square x) 
  (* x x))

(define (sum-of-squares x y) 
  (+ (square x) (square y)))

(define (sum-sq-largest-nums x y z)
  (if (> x y)
      (sum-of-squares x (if (> y z) y z))
      (sum-of-squares y (if (> x z) x z))))

(sum-sq-largest-nums 4 4 4)
(sum-sq-largest-nums 2 3 4)
(sum-sq-largest-nums 4 3 2)
(sum-sq-largest-nums 2 3 1)
(sum-sq-largest-nums 4 3 5)
(sum-sq-largest-nums 4 3 4)
