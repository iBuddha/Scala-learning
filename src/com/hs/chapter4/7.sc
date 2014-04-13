/**
 * Created by hs on 14-4-10.
 */
import scala.collection.JavaConversions.propertiesAsScalaMap
val properties:scala.collection.Map[String,String]=System.getProperties()


//
//val some:Map[String,String] = Map("a"->"b")
//println(some.getClass.getCanonicalName)
val keyLengthes=for(key<-properties.keySet) yield key.length
val maxLength=keyLengthes.max
properties.foreach{case(key,value)=>{
  println(key+" ".*(maxLength-key.length)+"|"+value)
}}


































properties.foreach((e:(String,String))=>println(e._1+"||"+e._2))





































