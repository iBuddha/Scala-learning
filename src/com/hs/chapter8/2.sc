/**
 * Created by hs on 14-4-15.
 */
class BankAccount(initialBalance:Double){
  private var balance = initialBalance
  def deposit(amount:Double) = {balance += amount; balance}
  def withdraw(amount:Double) = {balance -= amount; balance}
}
class SavingsAccount(initialBalance:Double) extends BankAccount(initialBalance){
  private var freeOperationCount:Int = 3
  def earnMonthlyInterest() = {super.deposit(10); freeOperationCount = 3}
  override def deposit(amount:Double) = {if(freeOperationCount >0) {freeOperationCount-=1;super.deposit(amount)} else super.deposit(amount*0.9)}
  override def withdraw(amount:Double) = {if(freeOperationCount>0) {freeOperationCount-=1;super.withdraw(amount)} else super.withdraw(amount*0.9)}
}
val account = new SavingsAccount(20)
account.deposit(100)
account.deposit(100)
account.deposit(100)
account.deposit(100)