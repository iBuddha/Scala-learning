import scala.collection.mutable.ArrayBuffer

class Network {
  class Member(val name:String){
    val contacts = new ArrayBuffer[Network#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name:String) = {
    val m = new Member(name)
    members += m
    m
  }
}
val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val barney = myFace.join("Barney")
val wilma = chatter.join("Wilma")
fred.contacts += barney

//def process[M <: n.Member forSome {val n : Network}](m1:M, m2:M) = (m1, m2)
type NetworkMember = n.Member forSome {val n: Network}
def process(m1:NetworkMember, m2:NetworkMember) = (m1, m2)
process(fred, barney)
process(fred, wilma)