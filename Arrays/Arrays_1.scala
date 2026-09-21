package Arrays

object Arrays_1{
    def main(args: Array[String]): Unit={
        // creating a predefined int array
        val intArray1 = Array(1,2,3,4,5)
        println(intArray1(0))

        //creating a predefined string array
        val stringArray1 = Array("Apple","Mango","Pineapple")
        println(stringArray1(0))

        // creating an empty int array
        val emptyIntArray1= new Array[Int](6)
        println(emptyIntArray1(0)) // initialized with 0
        emptyIntArray1(0)=49
        println(emptyIntArray1(0))

        // creating an empty string array
        val emptyStringArray = new Array[String](5)
        println(emptyStringArray(0)) // initialized with null
        emptyStringArray(0)="apple"
        println(emptyStringArray(0))
    }
}
