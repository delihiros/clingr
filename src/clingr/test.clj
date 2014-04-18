(ns clingr.test
  (:use [clingr.config]
        [clingr.api]
        [clingr.session]
        [clingr.user]
        [clingr.room])
  (:require [clj-http.client :as client]
            [clojure.data.json :as json]))

