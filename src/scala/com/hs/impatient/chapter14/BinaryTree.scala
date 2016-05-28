package com.hs.impatient.chapter14

/**
 * Created by hs on 2014/4/26.
 */
sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

object Main extends App{
  def leafSum(tree:BinaryTree):Int = {
    tree match {
      case Leaf(a) => a
      case Node(left, right) => leafSum(left) + leafSum(right)
    }
//    case a:Int => a
  }
  leafSum(Node(Node(Leaf(2),Leaf(3)), Leaf(3)))
}