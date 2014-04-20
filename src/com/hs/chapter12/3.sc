def factorial(n:Int) = {
  if(n<1)
    throw new IllegalArgumentException
  (1 to n).reduceLeft(_*_)
}
factorial(5)