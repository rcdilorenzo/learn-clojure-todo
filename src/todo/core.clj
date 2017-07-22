(ns todo.core
  (:require [todo.router]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.middleware.params :refer [wrap-params]]))

(def app
  (-> todo.router/handler
      wrap-params
      wrap-json-body
      wrap-json-response))
