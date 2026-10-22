package Week10

object list {

  // Function to return a list with each element squared
  def squareList(lst: List[Int]): List[Int] = {
    lst.map(x => x * x)
  }

  // Function to return the intersection of two character sets
  def intersectSets(s1: Set[Char], s2: Set[Char]): Set[Char] = {
    s1.intersect(s2)
  }

  def main(args: Array[String]): Unit = {

    // 1. Create a list of the first five prime numbers
    val primes = List(2, 3, 5, 7, 11)
    println("Prime Numbers List: " + primes)

    // 2. Call square function and display result
    val squaredPrimes = squareList(primes)
    println("Squared List: " + squaredPrimes)

    // 3. Create a set of unique characters from "hello world"
    val charSet1 = "hello world".toSet
    println("Unique characters in 'hello world': " + charSet1.mkString(", "))

    // 4. Create a second set and compute intersection
    val charSet2 = "world".toSet
    println("Unique characters in 'world': " + charSet2.mkString(", "))

    val commonChars = intersectSets(charSet1, charSet2)
    println("Intersection of both sets: " + commonChars.mkString(", "))

    // 5. Create a tuple with an Int, a String, and a Boolean
    val mixedTuple: (Int, String, Boolean) = (42, "Scala", true)
    println("Tuple: " + mixedTuple)

    // 6. Access and print each tuple element
    println("First element (Int): " + mixedTuple._1)
    println("Second element (String): " + mixedTuple._2)
    println("Third element (Boolean): " + mixedTuple._3)
  }
}

