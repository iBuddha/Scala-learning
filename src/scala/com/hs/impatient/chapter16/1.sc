import java.io.IOException

@SerialVersionUID(3854684252462565L) class Cat (val name:String){

  @throws(classOf[IOException]) def method(a:Int) = {
    val b = 6;
    a+b;
  }
}