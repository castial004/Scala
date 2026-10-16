package Class


class Employee(var empId:Int,var empName:String,var salary:Double){
    def display():Unit={
        println("ID:"+empId)
        println("Name:"+empName)
        println("Salary:"+salary)
    }
}
class Book(var bookId:Int,var bookTitle:String,var price:Double){
    def display():Unit={
        println("BookId:"+bookId)
        println("BookTitle:"+bookTitle)
        println("Price:"+price)
    }
}
class Student(var roll:Int,var name:String){
    def this()=this(0,"unknown")
    def display():Unit={
        println("Roll"+roll)
        println("Name"+name)
    }
}
object constructor{
    def main(args:Array[String]): Unit={
        // val emp1 = new Employee(1,"sahil",40000)
        // val emp2=new Employee(2,"Alice",60000)
        var s1= new Student(101,"Alice")
        var s2= new Student()
        s1.display()
        s2.display()
    }
}
