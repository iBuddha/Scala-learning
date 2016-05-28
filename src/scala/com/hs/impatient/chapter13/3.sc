//def reduceZero(l:List[Int]) = {
//  var result = List.empty[Int]
//  l.foreach((e:Int)=>if(e != 0) result=e::result)
//  result
//}
//reduceZero(List(1,3,5,0,3,0))
import scala.collection.mutable.LinkedList
def reduceZero(l:LinkedList[Int]) = {
  var cur = l
  while(cur != Nil){
    if(cur.next.elem == 0)
      cur.next = cur.next.next
    cur = cur.next
  }
  l
}
reduceZero(LinkedList(1,3,5,0,3,0))
















