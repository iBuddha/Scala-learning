def largestAt(fun:(Int)=>Int, inputs:Seq[Int]) = {
  val results = inputs.map((a:Int)=>(fun(a),a)).toMap
  results(results.keySet.max)
}
largestAt(x=>x*x, 1 to 10)
largestAt(x=>10*x - x*x, 1 to 10)