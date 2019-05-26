;; Define a multi line function
(defn hello [name]
    (println  "hello called")
    (println  "hello " name)
)

(hello "test")
(hello "alise")

;; Define a summing function
(defn summer [a b]
    (println (str a) "*" (str b) "=" (+ a b))
)

(summer 4 5)

;; Define a multiplication function
(defn multi [a b]
    (println (str a) "*" (str b) "=" (* a b))
)

(multi 4 5)