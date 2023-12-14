(ns main
  (:gen-class))

(defn sum-every-n [n coll]
  (when (seq coll)
    (let [current-sum (reduce + (take n coll))]
      (lazy-seq (cons current-sum (sum-every-n n (drop n coll)))))))

(defn -main [& args]
  (let [input-sequence [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15] ; Заданная последовательность чисел
        result (take 5 (sum-every-n 3 input-sequence))]
    (println "Result:" result)))

(-main)