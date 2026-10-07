package Input

object TypeConversion{
    def main(args: Array[String]): Unit={
        val age = "20"
        val numAge = age.toInt
        val doubleAge = numAge.toDouble
        val newNumAge = doubleAge.toInt
        println(numAge)
        println(doubleAge)
        println(newNumAge)
    }
}
