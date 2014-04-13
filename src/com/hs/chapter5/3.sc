/**
 * Created by hs on 14-4-11.
 */
class Time {
  private var hour = 0
  private var minute = 0
  def this(hour:Int, minute:Int) {
    this();
    if(!(0<=hour && hour<=23) || !(0<=minute && minute<=59))
      throw new IllegalArgumentException
    else{
      this.hour=hour
       this.minute=minute
    }
  }
}
new Time(22,29)

case class Time2(hour:Int, minute:Int){
  if(hour<0||hour>23||minute<0||minute>59)
    throw new IllegalArgumentException
  def before(other:Time2):Boolean={
    if(other.hour>this.hour)
      true
    else if(other.hour == this.hour && other.minute> this.minute)
      true
    else if(other.hour == this.hour && other.minute<= this.minute)
      false
    else
      false
  }
}
val a = new Time2(11,11)
val b =new Time2(12,12)
a.before(b)