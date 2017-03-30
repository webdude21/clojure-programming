(ns clojure_programming.chapter2
  (:require [clojure.string :as str]))

; try out comp
(def camel->keyword
  (comp keyword
        str/join
        (partial interpose \-)
        (partial map str/lower-case)
        #(str/split % #"(?<=[a-z])(?=[A-Z])")))

; the same function with thread last macro
(defn camel->keyword
  [s]
  (->> (str/split s #"(?<=[a-z])(?=[A-Z])")
       (map str/lower-case)
       (interpose \-)
       str/join
       keyword))

; the same function with thread fist macro
(defn camel->keyword
  [s]
  (-> keyword
      str/join
      interpose \-
      (map str/lower-case)
      (str/split s #"(?<=[a-z])(?=[A-Z])")))


(camel->keyword "camelCaseIsGreat")

(def sample (comp (partial take 10) (partial random-sample 0.1) range))

(sample 1 1000)
