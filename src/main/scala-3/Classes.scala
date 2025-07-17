class Classes {

  var myMood : String = "very good"
  var strength : Int = 20

  def laugh() : Unit ={
    println(s"Hello, I am in $myMood mood and the class strength is $strength")
  }

}

@main def myClass() : Unit ={

  val cl = new Classes
  cl.laugh();
  cl.myMood = "crying"
  cl.strength = 50
  cl.laugh()


}
