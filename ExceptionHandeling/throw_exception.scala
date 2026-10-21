package ExceptionHandeling

object throw_exception{
    def main(args:Array[String]):Unit={
        try{
            val age = 17
            if(age<=18){
                throw new IllegalArgumentException("minor")
            }
        }
        catch{
            case e: IllegalArgumentException=>
                println(e.getMessage())
        }
        finally{
            println("rest of code")
        }    
    
    }
}
