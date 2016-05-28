/**
 * Created by hs on 14-4-13.
 */
import scala.beans.BeanProperty;
class Student{
  @BeanProperty
  var name:String
  @BeanProperty var id:Long
}
new Student