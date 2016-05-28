package com.hs.impatient.chapter20

import scala.actors.Actor

/**
 * Created by hs on 2014/5/3.
 */
class WordCountGather(val partCount: Int) extends Actor {
  var currentPartCount = 0
  var count = 0

  def act() {
    while (true) {
      receive {
        case a: Int => count += a
          println("received a worldCount result from an actor")
          currentPartCount += 1
          println("current count is " + count)
          if (currentPartCount == partCount) {
            println("gathered all!")
            exit()
          }
      }
    }
  }
}
