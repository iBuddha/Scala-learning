/**
 * Created by hs on 14-4-10.
 */
import java.util.Calendar
val calender = new scala.collection.mutable.LinkedHashMap[String,Int]()
calender.put("Monday",Calendar.MONDAY)
calender.put("Tuesday",Calendar.TUESDAY)
for((name,day)<-calender){
  println(name+ " " +day)
}
Calendar.getInstance().get(Calendar.DAY_OF_MONTH)