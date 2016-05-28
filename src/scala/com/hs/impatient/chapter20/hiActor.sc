import scala.actors.Actor
import scala.actors.Actor._
class HiActor extends Actor{
  def act(){
    while(true){
      receive {
        case "hi" => println("Hello")
        case a:String => println(a)
        case _ => println("what?" + " from " + sender)
      }
    }
  }
}
val actor1 = new HiActor
actor1.start()
actor1 ! "Hi"

actor1 ! "hi"
val actor2 = actor {
  while(true){
    receive {
      case a:Any => println(a); actor1 ! a
    }
  }
}
actor2 ! 2

Thread.sleep(1000)


