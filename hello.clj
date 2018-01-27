; This is a simple hello world application
(ns hello )

(defn remove-last [items] (take (- (count items) 1) items))
(defn get-last [items] (take 1 (reverse items)))
(defn joiner [item] (str item ", "))

(
	defn hello
		([friends]
			(print
				(str
					"Hello "
					(reduce str (map joiner (remove-last friends)))
					(reduce str (get-last friends))
				)
			)
		)
)

(hello *command-line-args*)