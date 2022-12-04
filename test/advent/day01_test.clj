(ns advent.day01-test
  (:require [clojure.test :refer [deftest is]]
            [advent.day01 :refer [part1 part2]]))


(deftest part1-test
  (let [expected 69501]
    (is (= expected (part1 "day01.txt")))))


(deftest part2-test
  (let [expected 202346]
    (is (= expected (part2 "day01.txt")))))
