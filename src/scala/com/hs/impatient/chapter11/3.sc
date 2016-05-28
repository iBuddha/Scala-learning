/**
 * Created by hs on 14-4-18.
 */
import scala.math._
class Fraction(n:Int, d:Int){
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n,d)
  private val den: Int = if (d == 0) 0 else d* sign(d) / gcd(n,d)
  override def toString = num + "/" + den
  def gcd(a:Int, b:Int):Int = if(b == 0) abs(a) else gcd(b, a%b)
  def sign(a:Int) = if(a>0) 1 else if(a < 0) -1 else 0
  def +(another:Fraction) = {
    val newNum = num*another.den + den*another.num
    val newDen = den*another.den
    new Fraction(newNum, newDen)
  }
}
new Fraction(10,8)
new Fraction(10,8)+new Fraction(4,2)