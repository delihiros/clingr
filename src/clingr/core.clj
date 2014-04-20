(ns clingr.core
  (:use [clingr.session]
        [clingr.var]
        [clingr.room]))

(defmacro with-session [user & body]
  `(let [session# (clingr.session/create ~user)]
     (binding [clingr.var/*session* session#]
       ~@body)))

