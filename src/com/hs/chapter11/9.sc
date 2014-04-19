import java.io.File
object RichFile{
  def unapply(f:File) = {
    var path = f.getPath
    path = path.take(path.lastIndexOf('\\')+1)
    val name = f.getName
    val pureName = name.split("\\.")(0)
    val suffix = name.split('.')(1)
    Some((path, pureName, suffix))
  }
}
val RichFile(path, fileName, suffix) = new File("E:\\LIENCE.text")


println(path + " " + fileName + " " + suffix)
