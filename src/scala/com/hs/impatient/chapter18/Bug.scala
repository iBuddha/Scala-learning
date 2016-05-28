package com.hs.impatient.chapter18

/**
 * Created by hs on 2014/5/1.
 */
object then
object show
object around
class Bug {
  var position: Int = 0
  var forward: Boolean = true

  def turn(r: around.type): this.type = {
    forward = !forward
    this
  }

  def move(num: Int): this.type = {
    forward match {
      case true => position = position + num; this
      case false => position -= num; this
    }
  }

  def _show(): this.type = {
    println(position); this
  }

  def and(t: then.type) = this
  def and(s: show.type) ={this._show(); this}
}
