class Person {

  val name: String = "Ashwani";
  var age: Int = 23;

  def greet(): Unit = {
    println(s"Hello, A very good morning");
  }
  
  def tellMeYourName(name:String): Unit = {
    println(s"My name is ${name}");
  }

}
