abstract class Dim[T](val value: Double, val name: String){
  self:T =>
  def create(v:Double):T
  def +(other: Dim[T]) = create(value + other.value)
  override def toString() = value + " " + name
}
class Seconds(v: Double) extends Dim[Seconds](v, "s") {
   def create(v: Double) = new Seconds(v)
}
//class Meters(v: Double) extends Dim[Seconds](v, "m"){
//  def create(v: Double) = new Seconds(v)
//}
new Seconds(1L) + new Seconds(2L)