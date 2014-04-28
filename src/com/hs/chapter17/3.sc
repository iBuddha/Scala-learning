class Pair[T,S](val first:T, val last:S)
def swap[T,S](p:Pair[T,S]) = new Pair[S,T](p.last,p.first)
swap(new Pair("Hello",1))