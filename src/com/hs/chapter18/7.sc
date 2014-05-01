def fun(obj:{def close():Unit}, process:({def close():Unit}) => Unit) = {
  try{
    process(obj)
    obj.close()
  }catch{
    case e:Exception => obj.close()
  }
}
class Closable{
  def close() ={
    println("closing...")
    println("closed")
  }
}
def processClosable(closable:{def close():Unit}) = {
  println("procssing cloable " + closable)
  throw new Exception("thrown from processCloable")
}
fun(new Closable, processClosable)




