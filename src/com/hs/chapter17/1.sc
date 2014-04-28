class Pair[T,S](val first:T, val last:S){
  def swap()={
    new Pair(last, first)
  }
}
new Pair("Hello", 1).swap()