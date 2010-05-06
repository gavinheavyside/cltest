(defproject cltest "0.1.0-SNAPSHOT"
  :description "Minimal Cascalog example for Hadoop cluster"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [cascalog "1.0.0-SNAPSHOT"]
                 [org.apache.hadoop/hadoop-core "0.20.2-dev"]]
  :main cltest.core
  )
