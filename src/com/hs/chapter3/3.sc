/**
 * Created by hs on 14-4-8.
 */
val a = Array(1,2,3,4,5)
for(i <- 0 until a.length)
  yield {
    if(i%2==0 && i==a.length-1) a(i)
    else if(i%2==0)
      a(i+1)
    else
      a(i-1)
}