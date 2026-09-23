package Input

import scala.io.StdIn
object ArrayInput{
    def main(args: Array[String]): Unit={
        println("enter the size of the array")
        val size = StdIn.readInt()
        val emptyIntArray2 = new Array[Int](size)
        //index based
        println("enter elements of the array")
        for(i<-emptyIntArray2.indices){
            emptyIntArray2(i)= StdIn.readInt()
        }
        // for each
        emptyIntArray2.foreach(num=> print(num))
        println()
        //item based
        for(item<-emptyIntArray2){
            print(item+" ")
        } 
        println()
    }
}
