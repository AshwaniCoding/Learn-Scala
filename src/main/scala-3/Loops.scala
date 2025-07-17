@main
def loopingStatements(): Unit ={

  println("While Loop")
  var n : Int = 1;
  while(n<=10){
    print(n + " ")
    n=n+1
  }

  println()
  println("For Loop")

  for(x <- 1 to 10){
    print(x*15 + " ")
  }

  println()
  println()

  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  var tableOf5 = for y <- numbers yield y*5
  println(tableOf5)

  println("Squares")
  for n <- numbers do
    print(n*n + " ")

  println()
  println("For each loop")
  val vehicles = List("Car","Bus","Scooter","Train")
  vehicles.foreach(vehicle => println(s"This vehicle is ${vehicle}"))

  for vehicle <- vehicles do
    println(vehicle)

}