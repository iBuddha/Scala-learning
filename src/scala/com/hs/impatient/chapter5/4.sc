/**
 * Created by hs on 14-4-13.
 */
class Time{
  private var minutes = 0
  def this(hour:Int, minute:Int){
    this()
    minutes = hour*60+minute
  }
  def hour = minutes/60
  def minute = minutes%60
  def before(other:Time) = if (this.minute<other.minutes) true else false
}

new Time(11,20).before(new Time(11,29))
class Time2(hour:Int,minute:Int){
  private val minutes = hour*60 + minute
}