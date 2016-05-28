def makeString(i:Iterable[AnyRef], before:String, between:String, after:String) = {
  before + i.reduceLeft(_.toString + between + _.toString) + after
}
makeString(Array("God", "bless", "Scala"), ":) ", " ", " orz")