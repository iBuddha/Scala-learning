/**
 * Created by hs on 14-4-16.
 */
trait Logged{
  def log(msg:String){}
}
trait ConsoleLogger extends Logged{
  override def log(msg:String){println(msg)}
}
trait FileLogger extends Logged{
  override def log(msg:String){println("log by FileLogger: ")+msg}
}
trait TimestampLogger extends Logged{
  override def log(msg:String){
    super.log(new java.util.Date() + " " + msg)
  }
}
abstract class Account{
  def withdraw(amount:Double):Double
}
class SavingAccount extends Account with ConsoleLogger with TimestampLogger{
  def withdraw(amount:Double):Double={log("withdraw");amount}
}
new SavingAccount().withdraw(100)

