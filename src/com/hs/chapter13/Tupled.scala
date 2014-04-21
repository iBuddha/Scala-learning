package com.hs.chapter13

/**
 * Created by hs on 2014/4/21.
 */
object Tupled extends App{
  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(20, 2, 1)
  println(((prices zip quantities) map (p => p._1 * p._2)) sum)
    //  (prices zip quantities ).map(Function.tupled((a:Double,b:Int)=> a * b)(_))
   val tupleMultiply =  Function.tupled[Double, Int, Double]((a:Double, b:Int) => a * b)
  println((prices zip quantities).map(tupleMultiply(_)).sum)
}
