/**
 * Created by hs on 14-4-13.
 */
abstract class UnitConversion{
  def convert(from:Double):Double
}
object InchesToCentimeters extends UnitConversion{
  override def convert(from:Double)= from * 3.3
}
object MilesToKillometers extends UnitConversion{
  override def convert(from:Double) = from * 1.7
}
InchesToCentimeters.convert(11)