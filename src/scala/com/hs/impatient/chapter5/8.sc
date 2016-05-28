/**
 * Created by hs on 14-4-13.
 */
class Car(val producer:String, val serial:String, val year:Int, var number:String){
  def this(_producer:String, _serial:String){
    this(_producer,_serial,-1,null)
  }
  def this(_producer:String,_serial:String, _year:Int){
    this(_producer,_serial,_year,null)
  }
  def this(_producer:String,_serial:String,_number:String){
    this(_producer, _serial, -1, _number)
  }
}
new Car("benz","benz",2000,"NE8324")