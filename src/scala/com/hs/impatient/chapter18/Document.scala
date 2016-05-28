package com.hs.impatient.chapter18

/**
 * Created by hs on 2014/5/1.
 */
object Title
object Author
class Document {
  private var useNextArgAs: Any = null
  var title: String = ""
  var author: String = ""
  def setTitle(title:String): this.type = {
    this.title = title
    this
  }

  def setAuthor(author:String): this.type = {
    this.author = author
    this
  }

  def set(obj: AnyRef): this.type = {
    obj match{
      case Title => useNextArgAs = Title; this
      case Author => useNextArgAs = Author; this
    }
  }

  def to(arg: String): this.type = {
    if (useNextArgAs == Title) {
      title = arg
      this
    } else if(useNextArgAs == Author){
      author = arg
      this
    }else
      throw new IllegalArgumentException
  }

  override def toString() = "author: " + author + ";  title: " + title
}
