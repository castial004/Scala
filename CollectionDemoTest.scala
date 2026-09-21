object CollectionDemoTest {
    def squareLists(numbers: List[Int]):
        List[Int] = numbers.map(x=>x*x)

    def findIntersection(set1 : Set[Char],set2: Set[Char]): 
        Set[Char] = set1.intersect(set2)

  def main(args: Array[String]): Unit = {
    val primenumbers = List(2,3,5,7,11)
    println(squareLists(primenumbers))

  }
}

