

@main def myImmutableCollections():Unit={

  val list : List[Int] = List(3,5,7,4,2)
  val list1 : List[String] = List("Hello","Hi","Hola")

  val set : Set[Int] = Set(1,2,2,3,4,5)
  val set1 : Set[String] = Set("Hyundai","Hyundai","Kia")

  val map : Map[String,String] = Map("fat"->"thin","big"->"small")
  val map1 : Map[String,Int] = Map("fat"->1,"big"->2)

  val vector : Vector[Int] = Vector(3,5,8,3,2,1)

  val tuple = (3,"Hyundai",true)

  println(s"my list of values are $list")
  println(s"my list1 values are $list1")

  println(s"my set of values are $set")
  println(s"my set1 values are $set1")

  println(s"my map of values are $map")
  println(s"my map1 values are $map1")

  println(s"my vector values are $vector")

  println(s"my tuple values are $tuple")

}
