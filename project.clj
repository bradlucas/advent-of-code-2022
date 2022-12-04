(defproject advent "0.1.0-SNAPSHOT"
  :description "Advent of Code 2022 in Clojure"
  :url "http://adventofcode.com/2022"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/math.combinatorics "0.1.6"]]
  :repl-options {:init-ns advent.core}
  :main advent.core)
