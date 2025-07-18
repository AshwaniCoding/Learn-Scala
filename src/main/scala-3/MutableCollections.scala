//ArrayBuffer
//ListBuffer
//HashSet: Allows an addition to its set
//HashMap
//MutableList: A mutable linked list

import scala.collection.mutable._

@main def myMutableCollections(): Unit = {

  val arrayBuffer : ArrayBuffer[Int] = ArrayBuffer(1,2,3,4,5)
  val listBuffer : ListBuffer[String] = ListBuffer("Hyundai","Kia", "Maruti")
  val hashSet : HashSet[Int] = HashSet(1,2,3,4)
  val hashMap : HashMap[Int, String] = HashMap(1 -> "Hello",2 -> "Hi",3 -> "Hy",4 -> "Hey")

  println(s"My Array Buffer is $arrayBuffer")
  println(s"My List Buffer is $listBuffer")
  println(s"My Hash Set is $hashSet")
  println(s"My Hash Map is $hashMap")

  println()

  arrayBuffer+=6
  listBuffer.addOne("Tata")
  hashSet.add(78)
  hashMap.put(5,"Hola")

  println(s"Updated Array Buffer is $arrayBuffer")
  println(s"Updated List Buffer is $listBuffer")
  println(s"Updated Hash Set is $hashSet")
  println(s"Updated Hash Map is $hashMap")

}