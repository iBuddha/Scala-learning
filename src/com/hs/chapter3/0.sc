import scala.collection.mutable.ArrayBuffer

/**
 * Created by hs on 14-4-8.
 */
val a = (0 to 10).toArray
a.filter(_%2==0).map(println(_))






val b = 0 until (20,2)
b.map(println(_))










var c  = ArrayBuffer(1,2,3,-5,6,-1,-3,4)
var first =true
var n = c.length
var i=0
while(i<n){
  if(c(i)>=0)
    i=i+1
  else{
    if(first){
      first=false;i=i+1
    }else{
      c.remove(i);n=n-1
    }
  }
}
c.map(println(_))






var d = ArrayBuffer(1,2,3,-5,6,-1,-3,4)
var isFirst = true
d.filter(a=> if(a>=0){
  true
}else if(isFirst){
  isFirst=false;true
}else
  false
)










