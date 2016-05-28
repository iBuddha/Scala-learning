def showGenericType[T](param:T, m: Manifest[T]){
  println(m)
}
showGenericType(1, Manifest.Int)
def foo[T](x: List[T])(implicit m: Manifest[T]) = {
  if (m <:< manifest[String])
    println("Hey, this list is full of strings")
  else
    println("Non-stringy list")
}

foo(List("one", "two")) // Hey, this list is full of strings
foo(List(1, 2)) // Non-stringy list
foo(List("one", 2)) // Non-stringy list

class A[T]
val m = manifest[A[String]]
val cm = classManifest[A[String]]
m.typeArguments
cm.typeArguments
val tg = typetage[A[String]]