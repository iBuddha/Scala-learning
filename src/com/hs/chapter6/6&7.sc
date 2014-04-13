/**
 * Created by hs on 14-4-13.
 */
object Poker extends Enumeration{
  val Hearts = Value(0,"heart")
  val Clubs = Value("club")
  def isHeart(value:Poker.Value) = {if(value==Poker.Hearts) true else false}
}
Poker.Hearts.toString
Poker.Dlubs.toString
Poker.isHeart(Poker.Hearts)
