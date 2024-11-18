// statement list1RDD is a RDD
import org.apache.spark.rdd.RDD
var list1RDD: RDD[Int] = _

// Declare a character list list2, the list initialization value can be customized, and convert list2 to list2RDD.

val list2RDD = sc.parallelize(List("zhangsan", "lisi", "wangwu"))

// Based on the above results, using the 'contains' operator to filter all strings with connotation ''a'.

list2RDD.filter(x => x.contains("a")).foreach(println)

// Based on the above results, using the 'distinct' delete repeat element.

list2RDD.distinct().foreach(println)

// Based on the above results, using the randomSplit operator to rearrange the set elements and split them into multiple RDDs in proportion using random numbers.

list2RDD.randomSplit(Array(1)).foreach(println)

// list2RDD and list1RDD in List1Operations.scala, merge operation through union.

list2RDD.union(list1RDD.map(x => "x")).foreach(println)

// list2RDD and list1RDD in List1Operations.scala, perform intersection calculations through intersection.

list2RDD.intersection(list1RDD.map(x => "x")).foreach(println)

// list2RDD and list1RDD in List1Operations.scala, perform difference calculation through subtract.

list2RDD.subtract(list1RDD).collect

// list2RDD and list1RDD in List1Operations.scala, cartesian product operation via cartesian.

list2RDD.cartesian(list1RDD).collect

// Based on the above results, merge operation through union.

list2RDD.union(list1RDD.map(x => "x")).foreach(println)

// Read list2RDD through first, take, takeOrdered action operators respectively.

list2RDD.first().foreach(println)
list2RDD.take(1).foreach(println)
list2RDD.takeOrdered(1).foreach(println)

// Use stats, min, max, max, count, sum, and mean action operators respectively to generate descriptive statistical indicators for list1RDD.

list1RDD.stats()
list1RDD.min()
list1RDD.max()
list1RDD.count()
list1RDD.sum()
list1RDD.mean()

