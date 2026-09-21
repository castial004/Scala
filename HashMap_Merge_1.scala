import scala.collection.mutable.HashMap
object HashMap_Merge_1{
    def main(args:Array[String]):Unit={
        val map1 = HashMap[Int,Map[String,Any]]()
        map1+=(1->Map("Name"->"Raj","p1"->100,"p2"->90))
        map1+=(2->Map("Name"->"Bob","p1"->80,"p2"->90))
        map1+=(3->Map("Name"->"Sekh","p1"->30,"p2"->50))
        println(map1(2))
        val student = map1(2)
        val student2 = map1(3)
        map1(2)= Map("Name"->student("Name"),"p1"->85,"p2"->student("p2"))
        map1(3)=Map("Name"->student2("Name"),"p1"->student2("p1"),"p2"->80)
        println(map1)
        val map2 = HashMap[Int,Map[String,Any]]()
        map2+=(4->Map("Name"->"Jat","p1"->30,"p2"->40))
        map2+=(5->Map("Name"->"Bab","p1"->80,"p2"->60))
        map2+=(6->Map("Name"->"Ekha","p1"->70,"p2"->80))
        
        val student3 = map2(4)
        
        map2(4)=Map("Name"->student2("Name"),"p1"->student2("p1"),"p2"->60)
        println(map2)
        // merge both maps
    }
}
