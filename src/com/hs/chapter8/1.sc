/**
 * Created by hs on 14-4-15.
 */
class BankAccount(initialBalance:Double){
  private var balance = initialBalance
  def deposit(amount:Double) = {balance += amount; balance}
  def withdraw(amount:Double) = {balance -= amount; balance}
}
class checkingAccount(initialBalance:Double) extends BankAccount(initialBalance){
  override def deposit(amount:Double) = super.deposit(amount*0.9)
  override def withdraw(amount:Double) = super.withdraw(amount*0.9)
}