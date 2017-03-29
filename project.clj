(defproject clojure-programming "0.1.0-SNAPSHOT"
  :description "project to keep sample code and stuff while reading the excellent Clojure Programming book Edit"
  :url "https://github.com/webdude21/clojure-programming"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-programming.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
