import scala.collection.GenSeq

def corresponds[A,B](a:GenSeq[A], b:GenSeq[B], fun:(A,B)=>Boolean) = {
  !(a zip b).map((tuple:(A,B)) => fun(tuple._1, tuple._2)).toSet.contains(false)
}
//Array("Hello", "World!").corresponds(Array(5,6))(_.length == _)
corresponds(Array("Hello", "World!"), Array(5,6), (a:String, b:Int)=> a.length==b)

//corresponds(Array("Hello", "World!"), Array(5,6), (a, b)=> a.length==b)
//(a,b) => a.length==b wil not pass compilation, because compiler can't refer the types of a and b from
//the other two parameters. However, when using curring, there is no  problem