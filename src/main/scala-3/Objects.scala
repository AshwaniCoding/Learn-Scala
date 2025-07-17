class Objects(private var count : Int) {

  def increment() : Unit = {
    count += 1
  }

  def currentCount : Int = count

}

//Companion Objects: Same name as classname
object Objects {

  def apply(initialCount:Int) : Objects = new Objects(initialCount)

}

object MyMathOperation {
  def add(x:Int, y: Int ):Int = x+y
  val pi : Double = 3.1419
}

@main def myCompanion(): Unit={

  val sum = MyMathOperation.add(5,10)
  println(sum)

  val piValue = MyMathOperation.pi
  println(s"My pi value is $piValue")

  val incr = Objects(1)
  println(s"Initial count : ${incr.currentCount}")

  incr.increment()
  println(s"Initial count : ${incr.currentCount}")



}