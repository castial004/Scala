object MapTest {
  def main(args: Array[String]): Unit = {
    val primenumbers = List(2,3,5,7,11)
    println(primenumbers)
    val squared_number = primenumbers.map(x=>x*x)
    println(squared_number)

    // findig set interactions
    val set1 = "hellow world".toSet
    val set2 = Set('h','e','l','p','o')
    val common = set1.intersect(set2)
    print(common)

  }
}
