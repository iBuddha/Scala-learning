import java.awt.geom.{Ellipse2D, Rectangle2D}

/**
 * Created by hs on 14-4-17.
 */
trait RectangleLike{
  def translate{println("translate")}
  def grow{println("grow")}
}
val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike
egg.translate
