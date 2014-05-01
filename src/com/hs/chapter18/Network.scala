package com.hs.chapter18

import scala.collection.mutable.ArrayBuffer

/**
 * Created by hs on 2014/4/30.
 */
class Network {
  class Member(val name:String){
    val contacts = new ArrayBuffer[Network#Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name:String) = {
    val m = new Member(name)
    members += m
    m
  }
}
object Network{
  def equalss[M <: n.Member forSome {val n: Network}](m1:M, m2:M) ={
    if(m1.name.equals(m2.name))
      true
    else
      false
  }
}
