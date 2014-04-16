import com.hs._

/**
 * Created by hs on 14-3-26.
 */

val actor1 = new BlotActor
actor1.start
//actor1 ! (StormTuple("book", 10), actor2)
Thread.sleep(1000)
import scala.actors.Channel
val channel = new Channel[Int](actor1)
//channel ! StormTuple("ring",1000)
channel ! 100
//actor1 ! StormTuple("ring", 1000)
//channel.receive{
//  case StormTuple(name, count) => println("channel received a tuple")
//}
Thread.sleep(1000)






