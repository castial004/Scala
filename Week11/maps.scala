package Week11

import scala.collection.mutable.HashMap
object maps {

  // Function to merge two HashMaps, keeping the higher grade on conflict
  def mergeMaps(m1: Map[String, Int], m2: Map[String, Int]): Map[String, Int] = {
    m1.foldLeft(m2) { case (acc, (name, grade)) =>
      acc.updated(name, math.max(acc.getOrElse(name, 0), grade))
    }
  }

  // Function to simulate separate chaining: multiple values per key stored in a List
  def chainedMap(pairs: List[(String, Int)]): Map[String, List[Int]] = {
    pairs.groupBy(_._1).map { case (key, group) =>
      key -> group.map(_._2)
    }
  }

  def main(args: Array[String]): Unit = {

    // 1. Create a mutable HashMap of student grades
    val grades = HashMap(
      "Alice"   -> 85,
      "Bob"     -> 78,
      "Charlie" -> 92
    )
    println("Initial HashMap: " + grades)

    // 2. Insert multiple entries, including a duplicate key
    grades += ("David" -> 88)
    grades += ("Eva"   -> 74)
    grades += ("Alice" -> 95)   // duplicate key with a different grade
    println("After inserting duplicate key 'Alice' -> 95:")
    println(grades)

    // 3. Create a second HashMap with overlapping keys
    val grades2 = HashMap(
      "Alice"   -> 90,
      "Charlie" -> 99,
      "Frank"   -> 81
    )
    println("Second HashMap: " + grades2)

    // 4. Merge both HashMaps, keeping the higher grade on conflict
    val merged = mergeMaps(grades.toMap, grades2.toMap)
    println("Merged HashMap (higher grade wins):")
    println(merged)

    // 5. Demonstrate collision handling by chaining
    val records = List(
      ("Alice", 85),
      ("Alice", 95),
      ("Bob",   78),
      ("Bob",   82),
      ("Charlie", 92)
    )
    println("Raw records (with repeated keys): " + records)

    val chained = chainedMap(records)
    println("Chained HashMap (List of values per key):")
    chained.foreach { case (name, list) =>
      println(s"  $name -> $list")
    }
  }
}

