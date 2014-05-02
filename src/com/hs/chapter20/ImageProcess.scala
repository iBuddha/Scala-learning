package com.hs.chapter20

import javax.imageio.ImageIO
import java.io.File
import java.awt.image.BufferedImage
import javax.imageio.stream.FileImageOutputStream

/**
 * Created by hs on 2014/5/2.
 */
object ImageProcess extends App{
  val image = ImageIO.read(new File("E:\\wallpaper.jpg"))
  val width = image.getWidth
  val height = image.getHeight

  val newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
  val outputStream = new FileImageOutputStream(new File("E:\\inversedWallpaper.png"))

  val slices = (0 until height).toArray.grouped(height/6).toArray
  val partNumber = slices.length
  println("slices.length is : " + slices.length)
//for(i <- 0 until partNumber)
//  slices(i).foreach(println(_))
  val gather = new GatherActor(partNumber,newImage, outputStream)
  gather.start()
  for(i <- 0 until partNumber){
    val subActor = new InverseActor(gather,image, newImage)
    subActor.start()
    subActor ! (newImage,slices(i))
    println("send a actor")
    println(slices(i)(0) + " ^ " + slices(i).last)
  }
}
