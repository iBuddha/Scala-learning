/**
 * Created by hs on 14-4-8.
 */
def product(s:String): Long  = {
  if(s.length==1)
    return s.codePointAt(0)
  else
    return s.codePointAt(0)*product(s.tail)
}
println(product("Hello"))
