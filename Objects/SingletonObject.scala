package Objects

object Calculator{
    def add(a:Int,b:Int): Int={
        a+b
    }
}

object SingletonObject{
    def main(args:Array[String]): Unit={
        println(Calculator.add(10,20))
    }
}
