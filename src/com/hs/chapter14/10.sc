def compose(f1:Double=>Option[Double], f2:Double=>Option[Double]) : Double=>Option[Double]= {
  (param:Double) => {
    if( f1(param) == None || f2(param) == None)
      None
    else
      Some(f1(param).get + f2(param).get)
  }
}
def f(x:Double) = if(x >= 0) Some(scala.math.sqrt(x)) else None
def g(x:Double) = if(x != 1) Some(1/(x-1)) else None
val h = compose(f,g)
h(2)