def unless(condition:Boolean)(block: => Unit) = {
  if(condition) block
  else ()
}
unless(1 == 1){
  println("!")
}
