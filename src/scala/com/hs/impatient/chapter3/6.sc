import scala.collection.mutable.ArrayBuffer

/**
 * Created by hs on 14-4-8.
 */
val a = Array(1,2,3,4,5,6)
for(i <- 0 to a.length/2){
  val tmp = a(i)
  a(i) = a(a.length-1-i)
  a(a.length-1-i) = tmp
}
a.map(println(_))






var b = ArrayBuffer(1,2,3,4,5)
b=b.reverse
