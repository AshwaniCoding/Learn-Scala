object PersonObject {

  def main(args: Array[String]): Unit = {
    val person = new Person();
    person.greet();
    person.tellMeYourName(person.name);

  }


}
