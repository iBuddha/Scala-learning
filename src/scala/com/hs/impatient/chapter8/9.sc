/**
 * Created by hs on 14-4-16.
 */
class Creature{
  def range:Int = 10
  val env:Array[Int] = new Array[Int](range)
}
class Ant extends Creature{
  override def range = 2
}
class Ant2 extends Creature{
  override val range = 2
}
new Ant().range
new Ant2().range