(ns cltest.core
  (:use cascalog.api)
  (:require [cascalog [workflow :as w] [ops :as c]])
  (:gen-class)
  )

(w/defmapcatop split [sentence]
   (seq (.split sentence "\\s+")))
   
(defn -main [src dest]
   (let [source (hfs-textline src)] 
   (?<- (hfs-textline dest) [?w ?c] (source ?s) (split ?s :> ?w) (c/count ?c)))
)
