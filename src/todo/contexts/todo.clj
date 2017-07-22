(ns todo.contexts.todo
  (:require [todo.models.todo :as todo-model]))

(defn list-todos [] [])

(defn create-todo
  [params]
  (todo-model/create-todo (get params "title")))

(defn delete-todo [] [])

(defn get-todo [id] nil)
