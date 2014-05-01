class Living{
  println("construct Living")
}
class Animal extends Living{
  println("construct Animal")
}
class Human extends Animal{
  def move() = {println("move")}
  println("construct Human")
}
class Man extends Human{
  this: Animal =>
  println("construct Man")
}
val kk = new Human



val jack = new Man




//can't find a example
//self type has no effection on construct order and override order in the above codes
