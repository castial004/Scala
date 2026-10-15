package Maps
import scala.collection.mutable.HashMap

object Hmap_Chaining{
    def addWithChaining(hmap:HashMap[String,List[Int]],key:String,value:Int):Unit={
        if(hmap.contains(key)){
            hmap(key) = hmap(key):+value
        }else{
            hmap(key) = List(value)
        }
    }
    def main(args:Array[String]): Unit={
        val hmap1 = HashMap(
            "Alice"->85,
            "bob"->90,
            "charlie"->88
        )
        val hmap2 = HashMap(
            "bob"->92,
            "david"->80
        )
        val chainedHmap = HashMap[String,List[Int]]() 

        for((key,value)<-hmap1){
            addWithChaining(chainedHmap,key,value)
        }
        for((key,value)<-hmap2){
            addWithChaining(chainedHmap,key,value)
        }
        for((key,value)<-chainedHmap){
            println(s"$key: $value")
        }

    }
}
