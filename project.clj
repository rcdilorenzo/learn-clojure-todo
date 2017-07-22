(defproject todo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler todo.core/app}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.2"]
                 [ring/ring-jetty-adapter "1.6.2"]
                 [ring/ring-json "0.4.0"]
                 [ring.middleware.logger "0.5.0"]
                 [compojure "1.6.0"]
                 [danlentz/clj-uuid "0.1.7"]])
