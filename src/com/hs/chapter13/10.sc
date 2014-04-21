val s = "definitionaaabbbc"
import scala.collection.immutable.HashMap
s.par.aggregate(HashMap[Char,Int]())(
  (r,char) => { r + (char -> (r.getOrElse(char,0) + 1) )},
  (s1,s2) => s1 ++ s2.map{case(k,v)=> k -> (v + s1.getOrElse(k,0)) }
//(map1, map2) => map1 ++ map2.map{ case (k,v) => k -> (v + map1.getOrElse(k,0)) }
)
//about ++ between Maps, see below
HashMap('a'-> 1, 'b'->2) ++ HashMap('a'-> 3)
//the right map's k-v will override same key from left map