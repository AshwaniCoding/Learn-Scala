@main
def conditionalStatement(): Unit = {

  var num: Int = 19
  if (num > 5) {
    println(s"$num is greater than 5")
  } else if (num < 5) {
    println(s"$num is less than 5")
  }
  else {
    println(s"$num is equal to 5")

  }

  //Ternery operator
  var result = if(num>5) s"${num} is greater than 5" else if(num<5) s"${num} is less than 5" else s"${num} is equal to 5"
  println(result)

  val dayPeriod : String = "afternoon"

  val resultDay = dayPeriod match
    case "morning" => "start of the day"
    case "afternoon" => "its post 12 pm"
    println(resultDay)

}