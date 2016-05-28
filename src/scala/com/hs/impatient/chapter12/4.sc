def factorial(n:Int) = {
  (1 to n).foldLeft(1)(_*_)
}
//when use reduceLeft instead of foldLeft, and n<1, this function will throw
//an exception,saying empty.reduceLeft
factorial(-5)