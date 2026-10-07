package Input
import scala.io.StdIn
import scala.annotation.elidable

object SmartScholarshipSystem{
    def main(args:Array[String]): Unit={
        println("enter your marks")
        val marks = StdIn.readDouble()
        println("enter your attendence")
        val attendence = StdIn.readFloat()
        println("enter your family income")
        val income = StdIn.readLong()

        var score = 0
        var isEligible = false
        var marksElgible = false
        var attendenceElgible = false
        var incomeElgible = false
        if(marks>=85){
            score+=1
            marksElgible=true
        }
        if(attendence>=80){
            score+=1
            attendenceElgible=true
        }
        if(income<=300000){
            score+=1
            incomeElgible=true
        }
        if(score>=2){
            isEligible = true
        }
        println("is eligible: "+isEligible)
        println("condition satisfied:"+ score)
        if(score==3){
            println("full scolarship")
        } else if(score==2){
            println("partial scolarship")
        } else{
            println("no scholarship")
        }
    }
}
