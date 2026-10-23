package Objects
class Student{
    var name = ""
    var reg = ""
    var programme=""
    def display(): Unit={
        println("Name: "+name)
        println("Reg No: "+reg)
        println("Programme: "+programme)
    }
}
object Objects_1{
    def main(args: Array[String]): Unit={
        val s1 = new Student();
        s1.name = "sahil"
        s1.reg = "26MML0049"
        s1.programme = "M.tech AI/ML"
        s1.display()
        
    }
}

