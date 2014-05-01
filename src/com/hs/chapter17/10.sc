class Pair[S,T](var first:S, var second:T){
  def swap()(implicit ev : S=:=T)={
    new Pair(second,first)
  }
}
new Pair("Hi","lo").swap()
//new Pair(1,"Hle").swap()