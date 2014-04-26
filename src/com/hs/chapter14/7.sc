sealed abstract class Tree
case class Leaf(value:Int) extends Tree
case class Node(first:Tree, others:Tree*) extends Tree
def leafSum(tree:Tree):Int = {
  tree match {
    case Leaf(v) => v
    case Node(first, others @ _*) => leafSum(first) + others.map(leafSum(_)).sum //! other @ _* is necessary
  }
}
val tree = Node(Leaf(1), Leaf(2), Leaf(3), Node(Leaf(5)))
leafSum(tree)