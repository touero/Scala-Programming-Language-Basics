// The func parallelize() in SparkContext(aka sc in spark-shell) serialize local data

val rdd = sc.parallelize(1 to 10)


// The func textFile() in SparkContext(aka sc in spark-shell) load files in local or hdfs

val file = sc.textFile("file:///root/work.txt")

// Transform the exits RDD to create new RDD

val newrdd = rdd.map(_*2).collect
