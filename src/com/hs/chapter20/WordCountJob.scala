package com.hs.chapter20

import java.io.File

/**
 * Created by hs on 2014/5/3.
 */
object WordCountJob extends App{
  val traversalFileActor = new FileTraversal
  traversalFileActor.start()
  traversalFileActor ! ("TODO".r, new File("E:\\tmp\\src"))

}
