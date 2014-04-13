/**
 * Created by hs on 14-4-13.
 */
class Point(val x:Int, val y:Int){

}

object Point{
  def apply(x:Int, y:Int) = new Point(x,y)
}
Point(3,4)