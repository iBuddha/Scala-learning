package com.hs.impatient.chapter16

import scala.annotation.tailrec

/**
 * Created by hs on 2014/4/26.
 */
object Util extends App{

  def sum(xs : Seq[Int]) : BigInt = if(xs.isEmpty) 0 else xs.head + sum(xs.tail)
  //sum(1 to 100000000)
  @tailrec def tailRecSum(xs : Seq[Int], partial : BigInt) : BigInt = {
    if(xs.isEmpty)
      partial
    else
      tailRecSum(xs.tail,xs.head+partial)
  }
  println(tailRecSum(1 to 1000000, 0))
}
