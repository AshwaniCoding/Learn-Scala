class Constructors(name: String, age : Int) {

  val fullName : String = s"$name with age $age"

  def hello(): Unit = {
    println("Primary Constructor")
    println(s"hello, my full name is $fullName")
  }

}

class PersonWithAge(name: String, age: Int = 35) {

  def this (name: String) = this(name,35)
  val fullName = s"$name $age"

  def hello(): Unit ={
    println("Secondary Constructor")
    println(s"hello, my full name is $fullName")
  }

}

@main def myConstructor(): Unit ={

  val const = new Constructors("Ashwani", 23)
  println(const.fullName)
  const.hello()

  val pwa = new PersonWithAge("Akash")
  pwa.hello()

}
