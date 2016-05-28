import java.io.File
object RichFile{
  def unapplySeq(f:File):Option[Seq[String]] = {
    var path = f.getPath
    Some(path.split('\\'))
  }
}
val RichFile(a,b,c,d) =new File("E:\\home\\cay\\readme.txt")


