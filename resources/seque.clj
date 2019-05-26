
(def x (seq [1 2 3]))
(def y (seq [4 5 6]))
(def z (reverse (concat x y)))

(println z)
(def z (remove #(= 4 %) z))
(println z)
