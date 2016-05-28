package com.hs.impatient.chapter16

import com.sun.istack.internal.NotNull
import scala.util.continuations.cps
import scala.reflect.BeanProperty
import scala.annotation.{switch, varargs}
import scala.annotation.elidable

/**
 * Created by hs on 2014/4/26.
 */
@SerialVersionUID(3854684252462565L) class Question2 @deprecated() (@NotNull name:String @cps[Unit]) {
  @BeanProperty val age = 10
  @unchecked def plus(@NotNull a:Int) {
    val b =1
    a+b
  }

  @inline @varargs def process(args:String*) = {
    (args.head : @switch) match {
      case "hi" => "hello"
      case _ => "there"
    }
  }
  @elidable(500) def unnecessary(){}
}
