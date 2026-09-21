package Input
import scala.io.StdIn
object User_Input_1{
    def main(args: Array[String]): Unit={
        println("enter your name")
        val name = StdIn.readLine()
        println("enter your age")
        val age = StdIn.readInt()
        println("enter your section")
        val section = StdIn.readChar()
        println("enter your height in meters")
        val height = StdIn.readDouble()
        println("hello "+name+". Age is "+age+" belongs to section "+section+" and height is "+height+" cm")
    }
}

