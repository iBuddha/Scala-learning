def sum(list:List[Option[Int]]) = {
  list.map(_.getOrElse(0)).sum
}
sum(List(Option(1), None, Option(2)))