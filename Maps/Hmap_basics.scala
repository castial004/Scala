package Maps
import scala.collection.mutable.HashMap


object Hmap_basics{
    def main(args:Array[String]): Unit={
        val hmap1 = HashMap[String,Int]()
        hmap1("alice") = 85
        hmap1+=("bob"->25)
        println(hmap1)
        for((key,value)<-hmap1){
            println(s"$key:$value")
        }
        hmap1-=("bob")
        hmap1("alice") = 25
        for((key,value)<-hmap1){
            println(s"$key:$value")
        }
        
    }
}
