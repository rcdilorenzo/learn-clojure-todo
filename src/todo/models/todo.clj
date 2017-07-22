(ns todo.models.todo
  (:require [clj-uuid :as uuid]))


(defrecord Todo [id title completed created])

(defn create-todo
  [title]
  (Todo. (uuid/v4)
         title
         false
         (System/currentTimeMillis)))

(defn mark-completed
  [is-completed todo]
  (assoc todo :completed is-completed))
