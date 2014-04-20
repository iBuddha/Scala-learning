import scala.collection.mutable.Map
import scala.collection.immutable.SortedSet
def indexes(s:String) = {
  val map = Map[Char,SortedSet[Int]]()
  for(i <- 0 until s.length)
    map(s(i)) = map.getOrElse(s(i),SortedSet[Int]()) + i
  map
}
indexes("Mississippi")