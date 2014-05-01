def getPosition(a: Array[Int], e:Int): Int Either Int = {
  for(i <- 0 until a.length){
    if(e == a(i))
      return Left(i)
    else if(a(i) > e){
      if(e-a(i-1) > a(i) -e )
        return Right(i)
      else
        return Right(i-1)
    }
  }
  throw new IllegalArgumentException
}

getPosition(Array(1,2,3,4), 3)
getPosition(Array(1,3,6,9), 5)