@main
def data(): Unit = {

  val num1: Integer = 125;
  val num2: Float = 125.87;
  val num3: Long = 1298729635L;
  val num4: Double = 15245225.276987297469;

  println(s"My integer value is: ${num1}");
  println(s"My float value is: ${num2}");
  println(s"My long value is: ${num3}");
  println(s"My double value is: ${num4}");

  val myChar: Char = 'A';
  val myBoolT: Boolean = true;
  val myName: String = "Ashwani";

  println(s"My char value is ${myChar}");
  println(s"My bool value is ${myBoolT}");
  println(s"My name is ${myName}");

  val myFriendName: String = "Akash";
  val refName: AnyRef = myFriendName;

  println(s"My friend name is ${myFriendName}");
  println(s"Ref friend name is ${refName}");

  val nullVal: Null = null;
  val refNullVal: AnyRef = nullVal;

  println(s"Null value is ${nullVal}");
  println(s"Ref value is ${refNullVal}");

  val unitDataType: Unit = ();
  println(s"My unit data type is ${unitDataType}");

  def throwError(): Nothing ={
    throw new RuntimeException("Error in learning");
  }

  throwError();

}