class Bug{
  var position:Int = 0
  var forward:Boolean = true
  def turn() = {
    forward = !forward
    this
  }
  def move(num:Int) = {
    forward match{
      case true => position = position + num; this
      case false => position -= num; this
    }
  }
  def show() = {println(position);this}
}
new Bug().move(4).show().move(6).show().turn().move(5).show()




