val list = 5::4::3::2::1::Nil
(list:\List[Int]())(_ :: _)
(List[Int]()/:list)(_ :+ _)
(List[Int]()/:list)((l,e) => e :: l )
(list :\ List[Int]())((e,l) => l :+ e)