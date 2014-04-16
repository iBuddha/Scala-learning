
import com.hs.HiActor;
val a = 1
val actor1 = new HiActor
actor1.start()
actor1 ! "hi"

actor1 ! "ri"

import scala.actors.Actor._
val actor2 = actor {
  while(true){
    receive{
      case "Hi" => println("hello")
    }
  }
}

actor2 ! "Hi"
for(i <-  {1 to 10}){
  actor2 ! "Hi"
}
Thread.sleep(1000)










