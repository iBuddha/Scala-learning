/**
 * Created by hs on 14-4-17.
 */
import java.awt.Point
class OrderedPoint(x:Int, y:Int) extends Point(x,y) with scala.math.Ordered[Point]{
  def compare(that : Point)={
    if(this.x < that.x)
      -1
    else if(this.x == that.x && this.y < that.y)
      -1
    else if(this.x == that.x && this.y == that.y)
      0
    else
      1
  }
}

new OrderedPoint(1,3) < new OrderedPoint(2,4)
new OrderedPoint(1,3) < new OrderedPoint(1,4)
new OrderedPoint(1,3) == new OrderedPoint(1,3)