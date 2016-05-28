def adjustToPair(fun:(Int,Int) => Int) = {
  tuple:(Int,Int) => fun(tuple._1, tuple._2)
}
adjustToPair(_*_)((6,7))
((1 to 10) zip (11 to 20)).map((adjustToPair((a:Int,b:Int) => a+b )(_)))