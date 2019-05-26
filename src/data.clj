;; Define a list
(def numbers '(1 2 3 4 5 6 7 8 9))

;; Add a number to a list in the first position
(def numbers (conj numbers 4))


(println numbers)

;; access the number of items in a list
(println (count numbers))

;; access the nth number in a list
(println (nth numbers 0))

;; define and access an element in a list
(println (nth '(1 2 3 4) 2))

;; access an element from a string list
(def names '("one" "two" "three"))
(println (nth names 1))
