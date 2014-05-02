package com.hs.chapter20

import scala.actors.Actor
import java.awt.image.BufferedImage

/**
 * Created by hs on 2014/5/2.
 */
class InverseActor(val destiny:GatherActor, origin: BufferedImage, desImage: BufferedImage) extends Actor{
  override def act(){
    receive {
      case (image: BufferedImage, array: Array[Int]) => {
        for(i <- 0 until origin.getWidth())
          for( j <- array){
            val argb = origin.getRGB(i,j)
//            println("origin argb is " + "<" +i+","+j+"> " +argb)
            val r = (0x00ff0000&argb) >> 16
            val g = (0x0000ff00&argb) >> 8
            val b = 0x000000ff&argb
            val newR = 255-r
            val newG = 255-g
            val newB = 255-b
//            println(Array(newR, newG, newB).mkString("@"))
            val newARGB = 0xff000000|(newR<<16)|(newG<<8)|newB
//            println("new ARGB value is " + newARGB)
            desImage.setRGB(i,j,newARGB)
          }
        println("task completed")
        destiny ! "task completed"
        exit()
      }
      case _ => println("got sth unexpected!");exit()
    }
  }
}