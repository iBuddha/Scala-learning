/**
 * Created by hs on 14-4-10.
 */
val shoppingList=Map("apple"->10, "beer"->46)
val discountShoppingList=shoppingList.keySet.zip(shoppingList.values.map(_.toLong*0.9)).toMap
val list2=for((name,value)<-shoppingList)
  yield(name,value.toLong*0.9)
