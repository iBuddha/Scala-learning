/**
 * Created by hs on 14-4-17.
 */
import java.io.{InputStreamReader, File}
trait Logger{
  def log(msg:String)
}
trait ConsoleLogger extends Logger{
  def log(msg:String) = println(msg)
}
trait Buffered extends ConsoleLogger{
  this: java.io.InputStream =>
  protected var buffer: Array[Byte] = new Array[Byte](100)
  private var size = buffer.size
  private var position = size

  override def read(): Int = {
    if (position >= size) {
      log("\n--------read to buffer----------\n")
      read(buffer, 0, size)
      position = 1
      buffer(0)
    } else {
      position += 1
      buffer(position - 1)
    }
  }
}
var stream = new java.io.FileInputStream("E:\\LICENSE.txt") with Buffered
for(i <- 1 to 300)
  print(stream.read.toChar)
























































