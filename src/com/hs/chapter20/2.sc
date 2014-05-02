import java.awt.image.BufferedImage
import javax.imageio._
import java.io.{FileInputStream, File}
import javax.imageio.stream.FileImageOutputStream
import scala.actors.Actor
import sun.awt.image.PixelConverter.Argb
val image = ImageIO.read(new File("E:\\wallpaper.jpg"))
val width = image.getWidth
val height = image.getHeight

val newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
val outputStream = new FileImageOutputStream(new File("E:\\inversedWallpaper.png"))

class InverseActor(val destiny:GatherActor) extends Actor{
  override def act(){
    receive {
      case (image: BufferedImage, array: Array[Int]) => {
        for(i <- 0 until image.getWidth())
          for( j <- array){
            val argb = image.getRGB(i,j)
            val r = (0x00ff0000&argb) >> 16
            val g = (0x0000ff00&argb) >> 8
            val b = 0x000000ff&argb
            val newR = 255-r
            val newG = 255-g
            val newB = 255-b
            val newARGB = 0xff000000|(newR<<16)|(newG<<8)|newB
            newImage.setRGB(i,j,newARGB)
          }
        println("task completed")
        destiny ! "task completed"
      }
      case _ => println("got sth unexpected!")
    }
  }
}
class GatherActor(val number:Int) extends Actor{
  var currentNumber = 0
  def act(){
    receive{
      case _ => {
        currentNumber += 1;
        println("received one completed task")
        if (currentNumber == number) {
          println("gathered all parts")
          ImageIO.write(newImage, "png", outputStream)
          outputStream.flush()
          outputStream.close()
          exit()
        }
      }
    }
  }
}
val slices = (0 until height).toArray.grouped(height/6).toArray
val partNumber = slices.length
println("slices.length is : " + slices.length)

val gather = new GatherActor(partNumber)
gather.start()
for(i <- 0 until partNumber){
  val subActor = new InverseActor(gather)
  subActor.start()
  subActor ! (newImage,slices(i))
  println("send a actor")
}


Thread.sleep(120000)









