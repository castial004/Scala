package Maps

object Advance_Combinator{
    def main(args:Array[String]): Unit={
        val nums = (1 to 10).toList
        println(nums)
        val evenNums = nums.filter(_%2==0) // list of even numbers
        println(evenNums)
        val mul3 = nums.map(_*3)
        println(mul3)
        //val mul_3 = nums.map(n=>n*3)

        val pair = nums.flatMap(n=>List((n,n*n)))
        println(pair)

        //foldLeft
        val prod = nums.foldLeft(1)((acc,n)=>acc*n)
        println(prod)
    }
}
