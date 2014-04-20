import scala.math._
def values(fun:(Int)=>Int, low:Int, high:Int) = {
  var result = List.empty[(Int,Int)]
  for(i <- low to high){
    result = (i,fun(i))::result
  }
  result
}
values(x=> x*x, -5, 5)
values(x=>abs(x),-5,5)

