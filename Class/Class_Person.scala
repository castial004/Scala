import scala.collection.mutable.HashMap

class Person(var name:String,var age:Int,var city:String){

}
object Class_Person{
    def filterAge(person:List[Person]): List[Person]={
        person.filter(_.age>=30)
    }
    def groupByCity(person:List[Person]): HashMap[String,List[Person]]={
        val hmap = HashMap[String,List[Person]]()
        person.foreach(p=>{
            if(hmap.contains(p.city)){
                hmap(p.city) = hmap(p.city):+p
            }else{
                hmap(p.city) = List(p)
            }
        })
        hmap
    }
    def main(args:Array[String]): Unit={
        val p1 = new Person("sahil",21,"Delhi")
        val p2 = new Person("sagar",22,"Gujarat")
        val p3 = new Person("aryan",34,"Ahemndabad")
        val p4 = new Person("aadarsh",19,"Jharkhand")
        val p5 = new Person("hashnai",35,"Ahemndabad")
        val persons = List(p1,p2,p3,p4,p5)
        val above30 = filterAge(persons)
        above30.foreach(x=>print(s"${x.name} ${x.age}"))
        println()
        val hmap = groupByCity(persons)
        for((key,value)<- hmap){
            print(s"$key:")
            value.foreach(p=>print(s"name:${p.name}, age:${p.age},city:${p.city}"))
            println()
        }
    }
}
