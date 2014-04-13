/**
 * Created by hs on 14-4-8.
 */
def mi(x:Int, n:Int) : Double = {
  if (n>0 && n%2==0){
    val y= mi(x,n/2);
    y*y
  }else if(n>0 && n%2==1){
    x*mi(x,n-1)
  }else if(n==0)
    1
  else
    1/mi(x,-n)
}
println(mi(5,2))


println(mi(5,-2))


