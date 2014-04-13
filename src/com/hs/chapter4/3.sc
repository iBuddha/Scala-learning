import java.io.File
import java.util.Scanner

/**
 * Created by hs on 14-4-10.
 */
val in = new Scanner(new File("E:\\LICENSE.txt"))
//while(in.hasNext())
//  println(in.next())
var count = new scala.collection.immutable.HashMap[String,Int]()
while(in.hasNext()){
  val word=in.next()
  count=count+(word->(count.getOrElse(word,0)+1))
}
count.map(println(_))


































