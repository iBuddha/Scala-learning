/**
 * Created by hs on 14-4-18.
 */
class Money(val dollars:Int, val cents:Int){
  def +(that:Money) = new Money(dollars+that.dollars, cents+that.cents)
  def -(that:Money) = new Money(dollars-that.dollars, cents-that.cents)
  def ==(that:Money) = if(dollars == that.dollars && cents == that.cents) true else false
  override def toString = "$"+dollars+"."+cents
}
new Money(10,3) + new Money(5,4)
new Money(1,2) == new Money(1,2)

//should privde Money*Int Money/Int