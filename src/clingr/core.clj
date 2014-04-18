(ns clingr.core
  (:use [clingr.session]))

(def ^:dynamic *session* {})

(defmacro with-session [user & body]
  `(let [session# (clingr.session/create ~user)]
     (binding [clingr.core/*session* session#]
       ~@body)))


