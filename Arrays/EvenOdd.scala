package Arrays

object EvenOdd{
    def count(arr:Array[Int]):Unit={
        var even=0;
        var odd=0;
        for(num<-arr){
            if(num%2==0){
                even+=1
            }else{
                odd+=1
            }
        }
        println(s"no of odd $odd and no of even $even")
    }
    def main(args:Array[String]): Unit={
        val arr = Array(10,20,15) 
        count(arr)
    }
}

