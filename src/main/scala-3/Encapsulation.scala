
//private fields 
//getters and setters
//case class

class BankAccount(private val accountNumber: String, private var balance: Double) {

  def getAccountNumber: String = accountNumber

  def getBalance : Double = balance

  def deposit(amount:Double): Unit = {

    if(amount>0){
      balance += amount
      println(s"The amount deposited is $amount and current balance is $balance")
    }

  }

  def withdraw(amount:Double):Unit={

    if(amount>0 && balance>=amount){
      balance -= amount
      println(s"The amount withdrawn is $amount and current balance is $balance")
    }

  }

}

case class PersonNew(name:String, age : Int)

@main def myEncapsulation():Unit={

  val bankAccount = new BankAccount("67654389867",10000.00)
  println("My bank account number is:" + bankAccount.getAccountNumber)
  println("My bank account balance is:" +bankAccount.getBalance)
  bankAccount.deposit(500.00)
  bankAccount.deposit(50000.00)
  bankAccount.withdraw(60000.00)

}
