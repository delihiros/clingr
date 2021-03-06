(ns clingr.session
  (:use [clingr.api])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def create
  (lingr :post "/session/create"))

(def verify
  (lingr :get "/session/verify"))

(def destroy
  (lingr :get "/session/destroy"))

