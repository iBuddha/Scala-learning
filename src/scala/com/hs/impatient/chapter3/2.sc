/**
 * Created by hs on 14-4-8.
 */
val a = Array(1,2,3,4,5)
for(i <- 1 until (a.length,2)){
  val tmp = a(i)
  a(i) = a(i-1)
  a(i-1) = tmp
}
a.map((e:Int)=> print(e +" "))