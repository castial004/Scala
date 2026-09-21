import scala.collection.mutable.HashMap
object HashMapTest {
  def main(args: Array[String]): Unit = {
    val grades = HashMap[String,Int]()
    grades+=("Alice"->85)
    grades+=("Bob"->90)
    grades+=("Chalie"->88)
    // println(grades)
    grades+=("Alice"->95)
    // println(grades)

    val gradesList = List(80,85,90)
    val updated = gradesList.map(x=>x+5)
    println(updated)
    // val bonusGrades = grades.map(x=>x*10/100))
  }
}
