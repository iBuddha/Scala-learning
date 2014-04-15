/**
 * Created by hs on 14-4-16.
 */
class Point(val x:Double, val y:Double)
class LabeledPoint(val description:String, override val x:Double, override val y:Double) extends Point(x,y)
val p = new LabeledPoint("bj", 2934, 23424)