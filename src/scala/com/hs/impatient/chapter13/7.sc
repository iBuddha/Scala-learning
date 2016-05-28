val prices = List(5.0, 20.0, 9.95)
val quantities = List(20.0, 2, 1)
println(((prices zip quantities) map (p => p._1 * p._2)) sum)

//  (prices zip quantities ).map(Function.tupled((a:Double,b:Int)=> a * b)(_))
val tupleMultiply =  Function.tupled[Double, Double, Double]((a:Double, b:Double) => a * b)
println((prices zip quantities).map(tupleMultiply(_)).sum)
