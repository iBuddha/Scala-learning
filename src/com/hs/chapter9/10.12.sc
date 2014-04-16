/**
 * Created by hs on 14-4-16.
 */
trait Logged{
  def log(msg:String){}
}
trait LoggedException extends Exception with Logged{
  def log(){log(getMessage)}
}
class UnhappyException extends LoggedException{
  override def getMessage() = "arggh!"
}