object ArrayTest {
  def main(args: Array[String]): Unit = {
    val grades = Map(
      "Alice"->85,
      "Bob"->90,
      "Charlie"->88
    )
    println(grades("Alice"))
    println(grades("Bob"))
    println(grades("Charlie"))
    println(grades.contains("Bob"))
  }
}
