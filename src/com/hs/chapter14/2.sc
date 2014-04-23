def swap(pair:(Int,Int)) = {
  pair match {
    case (a, b) => (b, a)
  }
}
swap((1,2))