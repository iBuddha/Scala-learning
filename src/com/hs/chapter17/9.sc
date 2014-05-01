class Pair[T](var first:T, var second:T){
  def replaceFirst(newFirst:T) = this.first = newFirst
}
class NastyDoublePair(a:Double, b:Double) extends Pair[Double](a,b){
  override def replaceFirst(newFirst:Double) = {
    this.first = newFirst
  }
}
val pair:Pair[Any] = new NastyDoublePair(1.5, 2.5)
pair.replaceFirst("Helo")