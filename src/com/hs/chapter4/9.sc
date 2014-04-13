/**
 * Created by hs on 14-4-10.
 */
def lteqgt(values:Array[Int], v:Int) = {
  val lt = values.foldLeft((0,0,0)){
    case((lt,eq,gt),value)=>{
      if(value>v)
        (lt,eq,gt+1)
      else if(value==v)
        (lt,eq+1,gt)
      else (lt+1,eq,gt)}}
  lt
}
lteqgt(Array(1,2,2,3,4),2)