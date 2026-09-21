object ListTest {
  def main(args: Array[String]): Unit = {
    val numbers= List(10,20,30,40,50)
    println(numbers.head) 
    println(numbers.tail) 

    // traversing a list
    for(n<-numbers)
      print(n)
    
  }
}
