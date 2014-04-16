/**
 * Created by hs on 14-4-16.
 */
trait Logger{
  def log(msg:String)
}
trait TimestampLogger extends Logger{
  abstract override def log(msg:String) = super.log(new java.util.Date() + msg)
}
trait ConsoleLogger extends Logger{
  def log(msg:String) = println(msg)
}
new java.util.Date() with ConsoleLogger with TimestampLogger