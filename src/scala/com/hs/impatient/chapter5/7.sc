/**
 * Created by hs on 14-4-13.
 */
class Person(name:String){
  val firstName = name.split(" ")(0)
  val lastName = name.split(" ")(1)
}
val john = new Person("Jon Smith")
john.firstName
john.lastName