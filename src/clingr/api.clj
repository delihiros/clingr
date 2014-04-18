(ns clingr.api
  (:use [clingr.config])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def url
  "http://lingr.com/api")

(defn lingr [method request]
  (fn [params]
    (println params)
    (-> ((condp = method
           :get client/get 
           :post client/post)
         (str url request) 
         {:query-params params})
        :body
        json/read-str)))

