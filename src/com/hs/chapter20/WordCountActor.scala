package com.hs.chapter20

import scala.actors.Actor
import scala.util.matching.Regex
import java.io.{BufferedReader, FileReader, Reader, File}

/**
 * Created by hs on 2014/5/3.
 */
class WordCountActor(val gather : Actor, val regex: Regex) extends Actor{

  def act() {
    receive {
      case (file: File) => {
        var count = 0
        val reader = new BufferedReader(new FileReader(file))
        var line: String = ""
        while(line != null){
          count += regex.findAllIn(line).length
          line = reader.readLine()
        }
        gather ! count
        println("send a worldCount result to gather " + count)
        exit()
      }
    }
  }
}
