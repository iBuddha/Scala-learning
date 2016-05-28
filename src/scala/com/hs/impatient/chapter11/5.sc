/**
 * Created by hs on 14-4-18.
 */
/**
 * Created by hs on 14-4-18.
 */
import scala.collection.mutable.ArrayBuffer
class Table{
  private val html:String = ""
  private val tr:ArrayBuffer[String] = ArrayBuffer("<tr></tr>")
  def |(td:String) = {
    val str = tr.last
    val off = str.lastIndexOf("</tr>")
    val newTr = str.substring(0,off) + "<td>" + td + "</td>" + "</tr>"
    tr.trimEnd(1)
    tr+=newTr
    this
  }
  override def toString:String = "<table>"+tr.foldLeft("")((a:String,e:String) => a+e) + "</table>"
}
new Table()|"Java")

