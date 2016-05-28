package com.hs.impatient.chapter11

import java.io.File

/**
 * Created by hs on 2014/4/19.
 */
object RichFile {
  def unapply(f:File) = {
    var path = f.getPath
    path = path.take(path.lastIndexOf('\\')+1)
    val name = f.getName
    val pureName = name.split("\\.")(0)
    val suffix = name.split('.')(1)
    Some((path, pureName, suffix))
  }
}
object Main9 extends scala.App{
  val RichFile(path, fileName, suffix) = new File("E:\\LIENCE.text")
  println(path + " " + fileName + " " + suffix)
}