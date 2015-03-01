(ns ak-example.core
  (:gen-class))

(defn fizzbuzz [how-many]
  (for [x (into [] (take how-many (iterate inc 1)))]
    (let [
        mod3 (= (rem x 3) 0)
        mod5 (= (rem x 5) 0)
      ]
      (if (and mod3 mod5) "fizzbuzz"
        (if mod3 "fizz"
          (if mod5 "buzz" x))
      )
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [how-many]
  (println (clojure.string/join ", "
      (fizzbuzz (Integer/parseInt how-many))
  ))
)