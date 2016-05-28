import scala.collection.mutable

/**
 * Created by hs on 14-4-16.
 */
abstract class Item{
  def price:Double
  def description:String
}
class SimpleItem(val price:Double, val description:String)extends Item
class Bundle extends Item{
  var items = List[Item]()
  def addItem(item:Item) = {items = item :: items}
  override def price = items.foldLeft(0.0){(count:Double,item:Item) => count+item.price}
  override def description = items.foldRight("all items are :"){(i:Item,s:String)=> s + i.description+" || "}
}

val bundle = new Bundle
bundle.addItem(new SimpleItem(2.0, " a book"))
bundle.addItem(new SimpleItem(30.4, "a clothe"))
bundle.description
