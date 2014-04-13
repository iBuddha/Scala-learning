/**
 * Created by hs on 14-4-7.
 */
import scala.util.Random
def randomArray(n:Int) = {
  val result = new Array[Int](n);
  for(i <- 0 until n)
    result(i) = new Random().nextInt(n)
  result
}
randomArray(10).foreach{println(_)}













