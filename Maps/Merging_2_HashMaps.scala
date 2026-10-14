package Maps
import scala.collection.mutable.HashMap

object Merging_2_HashMaps{
    def mergeHmaps(map1:HashMap[String,Int],map2:HashMap[String,Int]): HashMap[String,Int]={
        val merged = HashMap[String,Int]()
        //iterate map1
        for((key,value)<- map1){
            merged(key) = value
        }
        // iterate map2
        for((key,value)<-map2){
            if(merged.contains(key)){
                merged(key) = Math.max(merged(key),value)
            }else{
                merged(key)=value
            }
        }
        merged
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
        val merged = mergeHmaps(hmap1,hmap2)
        for((key,value)<-merged){
            println(s"$key : $value")
        }
    }
}
