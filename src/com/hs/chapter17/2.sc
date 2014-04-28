class Pair[T](var first:T, var last:T){
  def swap() = {
    val tmp = first
    first=last
    last=tmp
    this
  }
}
val pair = new Pair("A","B").swap()
pair.first
pair.last