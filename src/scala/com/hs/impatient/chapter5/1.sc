/**
 * Created by hs on 14-4-11.
 */
class Counter{
  private var value = Int.MaxValue
  def increase(){if(value==Int.MaxValue) value=0 else value = Math.abs(value+1)}
  def current = value
}
val counter = new Counter
counter.current
counter.increase()
counter.current
