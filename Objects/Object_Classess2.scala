package Objects

class Employee(var id:String,var name:String,var salary:Double){
    def display(): Unit={
        println(s"emp_id = $id emp_name = $name emp_salary = $salary")
    }
}

object Object_Classess2{
    def main(args:Array[String]): Unit={
        val emp1 = new Employee("1","sahil",2000.20)
        emp1.display()
        emp1.name="sahil mall"
        emp1.display()
    }
}
