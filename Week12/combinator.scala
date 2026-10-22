package Week12


object combinator {

  def main(args: Array[String]): Unit = {

    // 1. Create a list of integers from 1 to 10
    val numbers = (1 to 10).toList
    println("Original List: " + numbers)

    // 2. filter: keep only even numbers
    val evens = numbers.filter(n => n % 2 == 0)
    println("Even Numbers (filter): " + evens)

    // 3. map: multiply each element by 3
    val tripled = numbers.map(n => n * 3)
    println("Tripled List (map): " + tripled)

    // 4. flatMap: pair each integer with its square
    val squares = numbers.flatMap(n => List((n, n * n)))
    println("Pairs of (n, n^2) (flatMap): " + squares)

    // 5. foldLeft: compute the product of all elements
    val product = numbers.foldLeft(1)((acc, n) => acc * n)
    println("Product of all elements (foldLeft): " + product)
  }
}

