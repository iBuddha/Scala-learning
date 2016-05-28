sealed abstract class Tree
case class Leaf(value:Int) extends Tree
case class Node(operator:(Int,Int) => Int, left:Tree, right:Tree) extends Tree
def eval(tree:Tree):Int = {
  tree match {
    case Leaf(v) => v
    case Node(operator,first, right) => operator(eval(first),eval(right)) //! other @ _* is necessary
  }
}
def plus(a:Int, b:Int) = a.+(b)
def minus(a:Int, b:Int) = a.-(b)
def times(a:Int, b:Int) = a.*(b)
val tree = Node(plus,Node(times,Leaf(3),Leaf(8)), Leaf(7))
eval(tree)