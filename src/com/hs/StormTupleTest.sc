import com.hs._

/**
 * Created by hs on 14-3-26.
 */

val actor1 = new BlotActor
actor1.start
//actor1 ! (StormTuple("book", 10), actor2)
Thread.sleep(1000)
import scala.actors.Channel
import scala.actors.Actor._
val channel = new Channel[String]
val actor2 = actor{
  react{
    case a:String => channel ! a
  }
}
actor2 ! "ni hao"
val actor3 =actor{
  react{
    case a:String => channel ! "recived in actor3"+ a
  }
}
actor3 ! "this is a message sent to actor3"
channel.receive{
  case a:String => println(a)
}
channel.receiveWithin(1000){
  case a:String => println(a)
}
channel.receive{
  case a:String => println(a)
}

