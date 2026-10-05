package Arrays


import scala.io.StdIn

object Sum_Avg_Arr{
    def Sum(arr:Array[Int]): Int={
        var sum=0;
        for(num <- arr){
            sum+=num
        }
        sum
    }
    def Avg(arr:Array[Int]): Int={
        val sum = Sum(arr)
        var size = arr.length
        val avg = sum/size
        avg
    }
    def main(args: Array[String]): Unit={
        val arr = Array(10,20,30,40)
        println("sum is: "+Sum(arr))
        println("sum is: "+Avg(arr))
    }
}

