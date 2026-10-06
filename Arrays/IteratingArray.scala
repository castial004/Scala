package Arrays

object IteratingArray{
    def main(args: Array[String]): Unit={
        val ages = Array(23,18,16,25,28)
        // element wise iteration
        for(age<- ages){
            print(age+" ")
        }
        println()
        // index wise iteration
        for(i<- ages.indices){
            println("age at index "+i+" is "+ages(i))
        }
        // for each method
        ages.foreach(age=>print(age+" "))
        println()

        //If you need to transform every element and produce a new array, use map
        val squared = ages.map(age=> age*age)
        println(squared) // prints garbage value
        for(age<-squared){
            print(age+" ")
        }
        println()
        //while loop
        var i=0
        while(i<squared.length){
            print(squared(i)+" ")
            i+=1
        }
    }
}
