/**
 * Created by hs on 14-4-18.
 */
/**
 *
 * Created by hs on 14-4-18.
 */
1::2::Nil // equals
Nil.::(2).::(1)

//apply and update
val scores = new scala.collection.mutable.HashMap[String,Int]
//scores("Bob") = 100
//val bobsScore = scores("Bob")
scores.update("Bob",100)
scores("Bob")
object Name{
  def unapply(name:String) ={
    Some((name.split(' ')(0), name.split(' ')(1)))
  }
}
val Name(first, last) = "Cay Horstman" //implicitly declared two vals : first and last
//first = "Jay"   //first is a val
