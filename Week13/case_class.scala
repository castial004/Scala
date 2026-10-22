package Week13

// 1. Define a case class Person
case class Person(name: String, age: Int, city: String)

object PersonOperations {

  // 2. Function to filter people older than 30
  def filterAdults(people: List[Person]): List[Person] = {
    people.filter(_.age > 30)
  }

  // 3. Function to group people by city
  def groupByCity(people: List[Person]): Map[String, List[Person]] = {
    people.groupBy(_.city)
  }

  // 4. Function to transform each Person into a formatted string
  def formatPeople(people: List[Person]): List[String] = {
    people.map(p => s"${p.name} is ${p.age} years old and lives in ${p.city}")
  }

  // 5. Function to sort people by age in ascending order
  def sortByAge(people: List[Person]): List[Person] = {
    people.sortBy(_.age)
  }

  def main(args: Array[String]): Unit = {

    // Create a list of five Person objects
    val people = List(
      Person("Alice",   28, "Chennai"),
      Person("Bob",     35, "Mumbai"),
      Person("Charlie", 42, "Chennai"),
      Person("David",   25, "Delhi"),
      Person("Eva",     31, "Mumbai")
    )
    println("Original List of People:")
    people.foreach(println)

    // Filter people older than 30
    val adults = filterAdults(people)
    println("\nPeople older than 30 (filter):")
    adults.foreach(println)

    // Group people by city
    val grouped = groupByCity(people)
    println("\nPeople grouped by city (groupBy):")
    grouped.foreach { case (city, persons) =>
      println(s"  $city -> ${persons.map(_.name).mkString(", ")}")
    }

    // Transform each Person to a formatted string
    val descriptions = formatPeople(people)
    println("\nFormatted descriptions (map):")
    descriptions.foreach(println)

    // Sort people by age in ascending order
    val sorted = sortByAge(people)
    println("\nPeople sorted by age ascending (sortBy):")
    sorted.foreach(println)
  }
}

