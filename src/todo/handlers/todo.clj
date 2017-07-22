(ns todo.handlers.todo
  (:require [todo.contexts.todo :as todo-context]
            [ring.util.response :refer [response]]))

(defn list-todos
  [request]
  (response {:todos (todo-context/list-todos)}))

(defn create-todo
  [params]
  (response {:todos (todo-context/create-todo params)}))
