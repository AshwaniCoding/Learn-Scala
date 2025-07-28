class HumanBeing {
  
  val name : String = "Ashwani"
  val hands : Int = 2
  val legs : Int = 2
  
  def greet(): Unit={
    println(s"Hello, My name is $name")
  }
  
  def limbs(): Int ={
    hands + legs
  }

}
