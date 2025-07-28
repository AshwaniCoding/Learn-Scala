object HumanObject {

  @main def myHuman():Unit ={

    val human = new HumanBeing
    human.greet()
    println(s"I have ${human.limbs()} limbs")

  }

}
