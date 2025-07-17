/*
* two types:
* 1 Subtyping
* 2 Parametric
*/
//Single Inheritance
class Vehicle1(name : String) {

  def makeSound(): Unit ={
    println("Some vehicle sound")
  }

}

class FourWheeler1(name:String, category: String) extends Vehicle1(name){

  override def makeSound() :Unit={
    println("ghrrr ghrrrr ghrrrr")
  }

  def displayCategory():Unit={
    println("Method with no args")
  }

  def displayCategory(a : Int):Unit={
    println("Method with 1 args")
  }

  def displayCategory(a: Int, b:Int):Unit={
    println("Method with 2 args")
  }

}

//Parametric Polymorphism
class Cylinder[T](value:T) {
  def getValue : T = value
}

//Multi Inheritance

trait CarColor1 {
  def getColor(): String
}

class TwoWheeler1(name:String, color:String) extends Vehicle1(name) with CarColor1{

  override def makeSound(): Unit ={
    println("hrrrr hrrrrrrr")
  }

  override def getColor():String = color

  def displayDetail(): Unit={
    println(s"$name is of color $color")
  }
}

@main def inheritanceExample1(): Unit={

  val obj = new FourWheeler1("Hyundai","SUV")
  obj.makeSound()

  val tw =  new TwoWheeler1("TVS", "red")
  tw.makeSound()
  println(tw.getColor())
  tw.displayDetail()

  obj.displayCategory()
  obj.displayCategory(1)
  obj.displayCategory(1,5)

  val intCyl = new Cylinder(5)
  val strCyl = new Cylinder("Ashwani")
  val charCyl = new Cylinder('A')

  println(intCyl.getValue)
  println(strCyl.getValue)
  println(charCyl.getValue)

}
