package Week9

object ArrayOperations {

  // Function to return the sum of an integer array
  def sumArray(arr: Array[Int]): Int = {
    var sum = 0
    for (element <- arr) {
      sum += element
    }
    sum
  }

  // Function to concatenate a string array separated by commas
  def concatFruits(arr: Array[String]): String = {
    arr.mkString(",")
  }

  def main(args: Array[String]): Unit = {

    // 1. Create an integer array
    val numbers = Array(2, 5, 9, 14, 20)
    println("Integer Array: " + numbers.mkString(", "))

    // 2. Call sum function and display result
    val total = sumArray(numbers)
    println("Sum of array elements: " + total)
      println()
    println()
    println()
    println()
    println()

    // 3. Create a string array of fruits
    val fruits = Array("Apple", "Banana", "Cherry", "Mango", "Orange")
    println("Fruit Array: " + fruits.mkString(", "))

    // 4. Call concatenation function and display result
    val concatenated = concatFruits(fruits)
    println("Concatenated Fruits: " + concatenated)

       println()
    println()
    println()
    println()

    // 5. Iterate over integer array and print each element
    println("Iterating over integer array:")
    numbers.foreach(element => println(element))
  }
}
