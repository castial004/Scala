package Arrays
import scala.io.StdIn

object LinearSearch{
    def linearSearch(arr:Array[Int],item:Int): Int={
        for(i<- arr.indices){
            if(arr(i)==item){
                return i
            }
        }
        -1
    }
    def main(args: Array[String]): Unit={
        val arr = Array(10,20,30,40)
        println("eneter item to search")
        val item = StdIn.readInt()
        val index = linearSearch(arr,item)
        if(index == -1){
            println("item doesnot exits")
        }else{
            println("item found at index: "+index)
        }
    }
}
