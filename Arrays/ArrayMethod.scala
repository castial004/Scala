package Arrays
import scala.io.StdIn
object ArrayMethod{
    def main(args:Array[String]): Unit={
        var names = new Array[String](3)
        // println(names(0))
        println(names.mkString(","))
        for(i<-names.indices){
            names(i) = StdIn.readLine()
        }
        for(n<-names){
            print(n+",")
        }
        names = names.sorted
        println()
        for(n<-names){
            print(n+",")
        }
        println()
        println(names.max)
        println(names.min)
        println(names.length)
        // println(names.sum)
    }
}
