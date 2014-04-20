import scala.collection.mutable.Map
import scala.collection.mutable.SortedSet
def indexes(s:String) = {
  val map = Map[Char,SortedSet[Int]]()
  for(i <- 0 until s.length) {
   var orgin = map.getOrElse(s(i), SortedSet[Int]())
    orgin += i
    map(s(i)) = orgin
  }
  map
}
indexes("Mississippi")