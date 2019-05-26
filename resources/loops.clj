

(defn counter [max]
    (loop [x 1]
    (when (< x max)
    (println x)
    (recur (+ x 1))))
    )

(counter 50)