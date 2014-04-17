import java.io.{InputStreamReader, File}

/**
 * Created by hs on 14-4-17.
 */
trait Buffered {
  this: java.io.InputStream =>
  protected var buffer: Array[Byte] = new Array[Byte](100)
  private var size = buffer.size
  private var position = size

  override def read(): Int = {
    println("read of trait Buffered is called")
    if (position >= size) {
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
stream.read

new InputStreamReader(new java.io.FileInputStream("E:\\LICENSE.txt")).read