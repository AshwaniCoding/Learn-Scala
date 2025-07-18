

@main def myExceptionHandling(): Unit={

  //ArithmeticException
  try{
    val result = 10/0
    println(result)
  }
  catch {
    case e: ArithmeticException => {println(s"There is an arithmetic exception ${e.getMessage}")}
  }

  //NullPointer Exception
  try{
    val result : String = null
    println(result.length)
  }
  catch {
    case e: NullPointerException => {println(s"There is an null pointer exception ${e.getMessage}")}
  }

  //ArrayIndexOutOfBound Exception
  try{
    val arr : Array[Int] = Array(1,2,3,4)
    println(arr(4))
  }
  catch {
    case e: ArrayIndexOutOfBoundsException => {println(s"There is an array index out of bound exception ${e.getMessage}")}
  }

  //Generic Exception
  try{
    throw new RuntimeException("runtime exception")
  }
  catch {
    case e: Exception => {println(s"There is generic exception ${e.getMessage}")}
  }
  finally {println("finally block")}

}
