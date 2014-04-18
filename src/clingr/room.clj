(ns clingr.room
  (:use [clingr.api]))

(def show
  (lingr :get "/room/show"))

(def get-archives
  (lingr :get "/room/get_archives"))

(def subscribe
  (lingr :get "/room/subscribe"))

(def unsubscribe
  (lingr :get "/room/unsubscribe"))

(def say
  (lingr :get "/room/say"))
