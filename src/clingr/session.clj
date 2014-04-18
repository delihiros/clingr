(ns clingr.session
  (:use [clingr.api]
        [clingr.config])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

(def ^:dynamic *session*
  (atom []))

(def create
  (lingr :post "/session/create"))

(def verify
  (lingr :get "/session/verify"))

(def destroy
  (lingr :get "/session/destroy"))
