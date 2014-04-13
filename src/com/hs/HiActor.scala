package com.hs
import scala.actors.Actor
/**
 * Created by hs on 14-3-25.
 */
class HiActor extends Actor{
   def act(){
    while(true) receive{
      case "hi" => println("hello")
      case _ => println("what's the fuck!")
//      case "wa" => println("waaaa~~")
    }
  }
}
