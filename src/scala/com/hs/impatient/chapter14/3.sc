import scala.reflect.ClassTag

def swap[T:ClassTag](a:Array[T]) = {
  a match{
    case _ if(a.length<2) => a
    case Array(e1,e2, _*) => Array(e2, e1) ++ a.takeRight(a.length-2)
  }
}
swap(Array(1,2,3,4)).foreach(println(_))





