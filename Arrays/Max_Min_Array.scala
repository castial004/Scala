package Arrays

object Max_Min_Array{
    def Max(arr:Array[Int]): Int={
        var max = Int.MinValue
        for(num <- arr){
            if(max<num) max=num
        }
        max
    }
    def Min(arr:Array[Int]): Int={
        var min = Int.MaxValue
        for(num <- arr){
            if(min>num) min=num
        }
        min
    }
    def main(args:Array[String]): Unit={
        val arr = Array(10,20,30,40)
        println("Max element in array: "+Max(arr))
        println("Min element in array: "+Min(arr))
    }
}
