(ns clingr.api
  (:use [clingr.var])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))


(def url
  "http://lingr.com/api")

(defn lingr [method request]
  (fn [params]
    (-> (client/request
          {:method method
           :url (str url request)
           :query-params (merge params clingr.var/*session*)})
        :body json/read-str)))

