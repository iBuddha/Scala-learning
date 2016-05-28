/**
 * Created by hs on 14-4-16.
 */
class MyStack[A] protected(protected val elems : List[A])
class MySubStack[A](elems:List[A]) extends MyStack[A](elems){}
new MySubStack[String](List("A"))
//new MyStack[String](List("A"))