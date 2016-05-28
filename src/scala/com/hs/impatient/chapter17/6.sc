def middle[T](iterable : Iterable[T]) ={
  val length = iterable.size
  var iter = iterable.iterator
  var result:T = iterable.head
  for( i <- 0 to length/2){
    result = iter.next()
  }
  result
}
middle("World")