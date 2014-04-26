sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

def leafSum(tree:BinaryTree):Int = {
  tree match {
    case Leaf(a) => a
    case Node(left, right) => leafSum(left) + leafSum(right)
  }
}
leafSum(Node(Node(Leaf(2),Leaf(3)), Leaf(3)))