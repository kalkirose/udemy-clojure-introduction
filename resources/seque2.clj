
(def z (seq [1 2 3 4 5 6 7 4 1 2 4]))
(println z)

(defn drop-nth [n coll]
   (keep-indexed #(if (not= %1 n) %2) coll))

(def z (drop-nth 3 z))
(println z)

(println (list z))
