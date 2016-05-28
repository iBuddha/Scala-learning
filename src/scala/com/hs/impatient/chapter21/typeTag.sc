import scala.reflect.runtime.universe._
class Foo{class Bar}
val f1 = new Foo
val b1 = new f1.Bar
val f2 = new Foo
val b2 = new f2.Bar

def m(f:Foo)(b:f.Bar)(implicit ev: TypeTag[f.Bar]) = ev

val ev1 = m(f1)(b1)
ev1.tpe
val ev2 = m(f2)(b2)
ev2.tpe

ev1 == ev2

ev1.tpe == ev2.tpe

def meth[A: TypeTag](list: List[A]) = typeOf[A] match{
  case t if t =:= typeOf[String] => println( "list of String"); println("typeOf[A] is "+ typeOf[A])
  case t if t <:< typeOf[Foo] => println("list of Foos"); println("typeOf[A] is "+ typeOf[A])
}

meth(List("a","b"))


meth(List(new Foo))



