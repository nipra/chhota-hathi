(defproject chhota-hathi "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]

                 ;; https://github.com/alexott/clojure-hadoop
                 ;; http://alexott.net/en/clojure/ClojureHadoop.html
                 [clojure-hadoop "1.4.1"]]
  :dev-dependencies [[swank-clojure "1.4.0"]]
  :repositories {
                 ;; Required for snapshots.
                 "sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"
                 ;; "sonatype-oss-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
                 })
