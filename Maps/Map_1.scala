package Maps

object Map_1{
    def main(args:Array[String]): Unit={
        val map = Map(
            "alice"->90
        )
        println(map("alice"))
    }
}
