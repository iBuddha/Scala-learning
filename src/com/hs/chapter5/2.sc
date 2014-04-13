/**
 * Created by hs on 14-4-11.
 */
class BankAccount{
  private var count = 0
  def  balance = count *0.01
  def deposit(value:Int){
    count=count+value
  }
  def withdraw(value:Int)={
    if(count-value<0)
      false
    else{
      count=count-value;
      true
    }
  }
}
val count = new BankAccount
count.deposit(100)
count.balance