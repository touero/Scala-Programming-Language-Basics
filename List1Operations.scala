// Declare an integer list list1, the list initialization value can be customized.

var list1 = List(1 to 10)

// Convert list1 to list1RDD.

var list1RDD = sc.parallelize(list1).collect

// Based on list1RDD, define a well-known function and combine it with the map conversion operator to implement the operation of dividing each element of list1RDD by 2 and taking the remainder.

def residual(x: Int): Int = {
  val result: Int x % 2
  return result
}

list1RDD.map(residual).collect

// Change the above named function to an unnamed function and perform the same operation logic.

list1RDD.map(x => x % 2).collect

// Based on the above, use _ instead of anonymous functions.

list1RDD.map(_ % 2).collect

// Based on the above results, use the filter operator to select all numbers greater than or equal to 2.

list1RDD.map(residual).filter(_ >= 2).collect
