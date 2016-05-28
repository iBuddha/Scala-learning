def toDimensionArray(a:Array[Double], colNum:Int) = a.grouped(colNum).toArray
val result = toDimensionArray((1 to 10).map(_.toDouble).toArray, 3)
result.foreach((a:Array[Double]) => { println(a.mkString(" "))})






