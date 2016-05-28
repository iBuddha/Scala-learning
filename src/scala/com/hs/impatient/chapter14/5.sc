val tree = List(List(3, 8), 2, List(5))
def leafSum(tree: List[Any]) = {
  var result: Int = 0
  tree foreach {
    _ match{
      case a:Int => result += a
      case e:AnyRef if e.isInstanceOf[List[Int]] =>{
//        var b = e.asInstanceOf[List[Int]]
        result += e.asInstanceOf[List[Int]].sum
      }
    }
  }
  result
}
leafSum(tree)