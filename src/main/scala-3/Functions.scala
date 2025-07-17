@main
def functions(): Unit ={

  /*
  *
  *
  */

  //Standalone Function
  def add(x : Int, y: Int): Int ={
    x+y
  }

  println(add(5,15))

  //Method is called when it is inside the class
  object Calculator {
    def multiplication( a:Int,b:Int): Int={
      a*b
    }
  }

  val result = Calculator.multiplication(5,20)
  println(result)

  class Calculator2 {
    def division(a:Int,b:Int):Int={
      a/b
    }
  }

  val calculator2 = new Calculator2()
  println(calculator2.division(10,2))

  //Anonymous Functions
  val square : Int => Int = (x:Int) => x*x
  val anonymousResult = square(8)
  println(anonymousResult)

  //High Order Function: If you want to create function inside a function but you are not sure while declaring
  def doMath(x:Int,y:Int, higher:(Int ,Int) => Int) : Int = {
    higher(x,y)
  }
  val higherResult = doMath(6,12, (a,b)=>a*b)
  val higherResult2 = doMath(6,12, (a,b)=>a+b)

  println(s"Higher result is $higherResult")
  println(s"Higher result is $higherResult2")

  //Curried Function
  def myCurried(x:Int)(y:Int):Int={
    x+y
  }
  val curriedResult1 = myCurried(5)
  val curriedResult2 = curriedResult1(10)

  println(s"Curried Result is $curriedResult1")
  println(s"Curried Result is $curriedResult2")
}
