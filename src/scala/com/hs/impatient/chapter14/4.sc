class Item(val name:String, val value:Double)
case class Multiple(number:Int, item:Item) extends Item(item.name, item.value)
def price(i:Item):Double = {
  i match{
    case Multiple(number,item) => price(item) * number
    case item:Item => item.value
  }
}
val apple = new Item("apple", 10)
val apples = Multiple(20, apple)
price(apples)
price(apple)