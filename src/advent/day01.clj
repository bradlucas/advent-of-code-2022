(ns advent.day01
  (:require [advent.core :as c]
            [clojure.math.combinatorics :as combo]))


(defn read-file-to-string [fname]
  (slurp (clojure.java.io/resource fname)))

(defn split-on [s fn]
  (clojure.string/split s fn))

(defn split-empty-lines [s]
  (split-on s #"\n\n"))

(defn split-eol [s]
  (split-on s #"\n"))

(defn convert-to-ints [l]
  (map #(Integer/parseInt %) l))

(defn string-to-list-ints [s]
  (convert-to-ints (split-eol s)))

(defn sum-ints [l]
  (reduce + l))

(defn find-max [l]
  (reduce max l))

(defn process [l]
  (map #(sum-ints (string-to-list-ints %)) l))




(defn part1 [fname]
  (-> fname
      read-file-to-string
      split-empty-lines
      process
      find-max))


(defn part2 [fname]
  (->> fname
      read-file-to-string
      split-empty-lines
      process
      sort
      reverse
      (take 3)
      (reduce +)))
