/**
 * Created by hs on 14-4-17.
 */
trait order[A]{
  def compare(that:A):Int
  override def equals(that:A):Boolean = {
    if(this.compare(that)== 0)
      true
    else
      false
  }
}
//http://www.scala-lang.org/api/current/#scala.math.Ordered
//type erasure lead to impossible to override equals method for Ordered trait