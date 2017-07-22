(ns todo.router
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [todo.handlers.todo :as todo-handler]))

(defroutes handler
  (GET "/todos" request
       (todo-handler/list-todos request))

  (POST "/todos" {params :body}
        (todo-handler/create-todo params))

  (route/not-found "<p>No route</p>"))
