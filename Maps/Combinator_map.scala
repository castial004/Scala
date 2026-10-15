package Maps

object Combinator_map{
    def main(args:Array[String]): Unit={
        val num = List(10,20,30,40)
        val updated = num.map(x=>{
            if(x<=90){
                x+10
            }
        })
        print(updated)
    }
}
