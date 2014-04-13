package com.hs
//import com.hs.StormTuple
/**
 * Created by hs on 14-3-26.
 */
class BlotActor extends scala.actors.Actor{
  override def act(){
//    val name:String = Any
//    val count:Int = null
    while(true){
      receive{
//        case (StormTuple(name:String, count:Int), actor2 : HiActor) => { println("name is " + name + " and count is " + count); actor2 ! "hi"}
        case StormTuple(name:String, count:Int) => println( name  + count)
        case a:Int => println("received an integer")
        case b:AnyRef => println("who know what is its type " + b.getClass)
        case _ => println("illeagal tuple")
      }
    }
  }
}
