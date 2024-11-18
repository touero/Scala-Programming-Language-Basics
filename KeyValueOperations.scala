// Create a key-value RDD

val words = Array("a", "b", "c").collect
val keyValueRDD = sc.makeRDD(words).map(x => (x,1)).collect

// Based on above results, filter key < 5 element in RDD

keyValueRDD.filter { case (key, value) => value < 5 }

// Use sortByKey to sort in ascending order by key size.

keyValueRDD.sortByKey().collect

// Based in above results, using reduceByKey to implement the cumulative summation of RDD.

keyValueRDD.reduceByKey((x, y) => x + y).collect

// Actual code reveals the difference between map and flatmap conversion operators.
list1RDD.map(x => (x to 10)).collect
list1RDD.flatMap(x => (x to 10)).collect
