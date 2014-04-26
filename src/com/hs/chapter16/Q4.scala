package com.hs.chapter16

import scala.annotation.varargs

/**
 * Created by hs on 2014/4/26.
 */
object Q4 {
 @varargs def sum(args : Int*) : Int = args.sum
}
