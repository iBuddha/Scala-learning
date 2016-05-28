/**
 * Created by hs on 14-4-13.
 */
class Person(_age:Int){
  val age = if (_age<0) 0 else _age
}
new Person(6)