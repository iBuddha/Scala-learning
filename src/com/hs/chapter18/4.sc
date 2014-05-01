import scala.collection.mutable.ArrayBuffer


class Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Network#Member]
//has to use a val refering to the outer instance. else, I can't figure out how to got the outer instance of a Memeber
    private val outer = Network.this

    override def equals(obj: Any): Boolean = {
      if (obj.isInstanceOf[Network.this.Member]) {
        val other = obj.asInstanceOf[Member]
        if (other.outer == this.outer)
          if (other.name == this.name)
            return true
          else if (other.name.equals(this.name))
            return true
      }
      false
    }
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
val chatter = new Network
val myFace = new Network
val fredA = chatter.join("Fred")
val fredB = chatter.join("Fred")
val fredC = myFace.join("Fred")
fredA.equals(fredB)
fredB.equals(fredC)


