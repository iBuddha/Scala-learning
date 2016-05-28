/**
 * Created by hs on 14-4-8.
 */
val a = Array(1,-5,234,2,-2,-7,0,4)
val result = a.filter(_>0) ++ a.filter(_<=0)
result.map((a:Int)=> print(a + " "))
