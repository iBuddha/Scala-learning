/**
 * Created by hs on 14-4-8.
 */
import scala.collection.mutable.ArrayBuffer

var a  = ArrayBuffer(1,2,3,-5,6,-1,-3,4)
//var buffer = ArrayBuffer[Int]()
//for(i <- 0 until a.length)
//  if(a(i) < 0)
//    buffer+=i
//buffer.map(println(_))

var buffer = (0 until a.length).filter(a(_)<0).reverse.dropRight(1)
//buffer = buffer.reverse.dropRight(1)
for(i<- buffer)
  a.remove(i)
println(a)


