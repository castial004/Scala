package ExceptionHandeling

object try_catch{
    def main(args: Array[String]): Unit={
        try{
            val result = 10/0
            println(result)
        }
        catch{
            case e: ArithmeticException=>
                println("division by zero not allwed")

        }
        finally{
            println("rest of the code always executed")
        }
    }
}
