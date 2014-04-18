/**
 * Created by hs on 14-4-17.
 */
trait logger {
  def log(msg: String)
}
class KaiserCrypto(key: Int) extends logger {
  def log(msg: String) {
    val newChars = for (c <- msg)
    yield {
      if (c + key > 'z')
        (c + key - 26).toChar
      else
        (c + key).toChar
    }
    println(newChars)
  }
}

new KaiserCrypto(1).log("abcd")





