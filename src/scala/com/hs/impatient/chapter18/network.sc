import com.hs.impatient.chapter18.Network

val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val barney = myFace.join("Barney")
fred.contacts += barney

//def process[M <: Network#Member](m1:M, m2:M) = (m1, m2)
def process[M <: n.Member forSome {val n : Network}](m1:M, m2:M) = (m1, m2)
val wilma = chatter.join("Wilma")
process(fred, barney)
process(fred, wilma)
//Error:(14, 10) type mismatch;
//found   : A$A10.this.chatter.Member
//required: M
//process(fred, barney)
//^