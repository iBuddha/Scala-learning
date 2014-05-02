import scala.actors.Actor
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

val array = new ArrayBuffer[Int]
val rand = new Random(47)
for(i <- 1 to 10000000)
  array += rand.nextInt(50000)
println("got the big array")


class RangeSumActor extends Actor{
  def act(){
    receive{
      case (a:ArrayBuffer[Int], averageActor:AverageActor) =>
        println("culculating ...")
      var result: BigInt = 0
        a.foreach((e:Int) => result = result + e)
        println("send a partial sum " + result)
      averageActor ! (result, a.length)
      case _ => println("got sth unexpected in RangeSumActor")
    }
  }
}
class AverageActor(val partCount:Int) extends Actor{
  var totalNumber:Int = 0
  var sum:BigInt = 0
  var currentPartCount = 0
  def act() {
    while (true) {
      receive {
        case (partialSum: BigInt, number: Int) =>
          println("received a partialSum : " + partialSum)
          sum += partialSum
          currentPartCount += 1
          totalNumber += number
          println("now has received " + currentPartCount + " partialSums")
          if (currentPartCount == partCount) {
            println(sum / totalNumber)
            exit()
          }
        case _ => println("got sth unexpected in AverageActor")
      }
    }
  }
}
val averageActor = new AverageActor(100)
averageActor.start()
for(i <- array.grouped(100000)){
  val subActor = new RangeSumActor
  subActor.start()
  subActor ! (i, averageActor)
  println("dispatched a subArray")
}






























Thread.sleep(10000)










