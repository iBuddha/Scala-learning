package com.hs.chapter20

import scala.actors.Actor
import java.io.File
import scala.collection.mutable.ArrayBuffer
import scala.util.matching.Regex

/**
 * Created by hs on 2014/5/3.
 */
class FileTraversal extends Actor {
//  private val files = ArrayBuffer[File]()
  private def collectFile(f: File, collector:ArrayBuffer[File]): Unit = {
    if (f.isDirectory) {
      for (subFile <- f.listFiles())
        collectFile(subFile, collector)
    } else{
      println(f.getName)
      collector += f
    }
  }
  def act() {
    receive {
      case (r:Regex, file: File) =>
        val collector = ArrayBuffer[File]()
        collectFile(file,collector)
        val gather = new WordCountGather(collector.length)
        gather.start()
      for(f <- collector){
        val wordCountActor = new WordCountActor(gather, r)
        wordCountActor.start()
        wordCountActor ! f
        println("find a file and send it to a worldCountActor " + f.getName)
      }
    }
  }
}
