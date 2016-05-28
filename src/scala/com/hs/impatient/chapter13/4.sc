def getNumbers(a:Array[String], m:Map[String,Int]) = {
  a.flatMap(m.get(_))
}
getNumbers(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" ->5)).foreach(println(_))



