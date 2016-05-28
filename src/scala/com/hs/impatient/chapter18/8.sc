def printValues(f: {def apply(a:Int):Int}, from: Int, to: Int) = {
  (from to to).foreach(a => println(f(a)))
}
printValues(Array(1,2,3,4,5,8,14,234,433,22), 3, 6)





