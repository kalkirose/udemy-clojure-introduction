;; Define a new name space
(ns foo.bar)

(defn hello [] 
    (println "hello world")
)

(hello)

;; Import a namespace form Java
(import java.util.Date)

(println (new Date))