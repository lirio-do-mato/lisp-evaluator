(ns lisp-evaluator.core
  (:gen-class))

(defn exit-program "Exits the program with a goodbye message." [] 
  (println "Thank you for using the LISP evaluator!")
  (println "Exiting the program...")
  (Thread/sleep 1000)  
  (println "Goodbye!")  
  (System/exit 0))

(defn -main "My first Clojure project: a LISP evaluator." []
  (println "Welcome to my first Clojure project!")
  (println "This is a simple LISP evaluator.")
  (loop []
    (print "Please enter a LISP expression (or 'exit' to quit): ") (flush)
    (let [input (read-line)]
      (when (= input "exit") 
        (exit-program))
      (recur))))