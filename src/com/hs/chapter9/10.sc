/**
 * Created by hs on 14-4-17.
 */
class IterableInputStream(path:String) extends java.io.FileInputStream(path:String) with Iterable[Byte]{
  var position:Int = 0
  def iterator:Iterator[Byte] = new Iterator[Byte]{
    var tmp:Byte = -2.toByte // --2 to indicate tmp is empty
    def hasNext() = {
      if(tmp == -1.toByte)
        false
      else if(tmp == -2.toByte){
        tmp = read().toByte
        if(tmp == -1.toByte)
          false
        else
          true
    }else
        true
    }
    def next():Byte = {
      if(tmp == -1.toByte)
        return tmp
      else if(tmp == -2.toByte){
        var c = read().toByte
        c
      }else{
        val result =tmp
        tmp = -2.toByte
        result
      }
    }
  }
}
new IterableInputStream("E:\\LICENSE.txt").foreach((b:Byte) => print(b.toChar))













































