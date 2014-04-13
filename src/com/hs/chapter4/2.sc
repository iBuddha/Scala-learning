import java.io.File
import java.util.Scanner

/**
 * Created by hs on 14-4-10.
 */
val in = new Scanner(new File("E:\\LICENSE.txt"))
//while(in.hasNext())
//  println(in.next())
val count = new scala.collection.mutable.HashMap[String,Int]()
while(in.hasNext()){
  val word =in.next()
  count+=(word->(count.get(word).getOrElse(0)+1))
}
count.map(println(_))





































































