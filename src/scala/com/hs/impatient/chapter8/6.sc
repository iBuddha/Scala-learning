/**
 * Created by hs on 14-4-16.
 */
class Point(val x:Double, val y:Double)
abstract class Shape{
  def centerPoint:Point
}
class Rectangle(val leftUpCorner:Point, val width:Double, val height:Double) extends Shape{
  override def centerPoint = new Point(leftUpCorner.x + width/2, leftUpCorner.y - height/2)
}
class Circle(override val centerPoint:Point, val r:Double) extends Shape