package com.hs.impatient.chapter20

import scala.actors.Actor
import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import javax.imageio.stream.FileImageOutputStream

/**
 * Created by hs on 2014/5/2.
 */
class GatherActor(val number:Int, val image:BufferedImage, val outputStream: FileImageOutputStream ) extends Actor{
  var currentNumber = 0
  def act(){
    while(true) {
      receive {
        case _ => {
          currentNumber += 1;
          println("received one completed task, currentNumber is " + currentNumber)
          if (currentNumber == number) {
            println("gathered all parts")
            ImageIO.write(image, "png", outputStream)
            outputStream.flush()
            outputStream.close()
            println("closed image")
            exit()
          }
        }
      }
    }
  }
}