

//private
//protected
//public

//Private
class Outer{
  class Inner {
    private def displayGreeting():Unit={ println("Hey there")}
    displayGreeting()
    class Innermost {
      displayGreeting()
    }
  }
  val innerObj = new Inner
//  innerObj.displayGreeting()
}

//Protected
package pro{

  class Super {
    protected def display(): Unit = {
      println("heeeeee heee")
    }


    class Sub extends Super {
      display()
    }

    class Other {
      (new pro.Super).display()
    }
  }
}

//Public
package pub{

  class IndoorGames {
    def display():Unit={println("Hey i am public")}
  }

  class Chess extends IndoorGames{
    display()
  }
  class Carom extends IndoorGames{
    (new IndoorGames).display()
  }
  class Ludo {
    (new IndoorGames).display()
  }

}

