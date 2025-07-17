//Single Inheritance
class Vehicle(name : String) {

  def makeSound(): Unit ={
    println("Some vehicle sound")
  }

}

class FourWheeler(name:String, category: String) extends Vehicle1(name){

  override def makeSound() :Unit={
    println("ghrrr ghrrrr ghrrrr")
  }

}

//Multi Iheritance

trait CarColor {
  def getColor(): String
}

class TwoWheeler(name:String, color:String) extends Vehicle1(name) with CarColor1{

  override def makeSound(): Unit ={
    println("hrrrr hrrrrrrr")
  }

  override def getColor():String = color

  def displayDetail(): Unit={
    println(s"$name is of color $color")
  }
}

@main def inheritanceExample(): Unit={

  val obj = new FourWheeler1("Hyundai","SUV")
  obj.makeSound()

  val tw =  new TwoWheeler1("TVS", "red")
  tw.makeSound()
  println(tw.getColor())
  tw.displayDetail()

}