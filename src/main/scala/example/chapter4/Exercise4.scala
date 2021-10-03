package example.chapter4

case class Point(x: Int, y: Int)

object Exercise4 extends App {
  def circleArea(radius: Double): Double = radius * radius * Math.PI

  @annotation.tailrec
  def printFiveToFiftyIncrementFive(start: Int = 5): Unit = {
    if (start > 50) {
      return
    }
    println(start)
    printFiveToFiftyIncrementFive(start + 5)
  }
  def toDateString(ms: Long): String = {
    val day = ms / (1000 * 60 * 60 * 24)
    val hour = ms / (1000 * 60 * 60) % 24
    val minute = ms / (1000 * 60) % 60
    val second = ms / 1000 % 60
    day.toString + ':' + hour.toString + ':' + minute.toString + ':' + second.toString
  }

  @annotation.tailrec
  def pow(a: Long, b: Int = 2): Long = {
    if (b <= 1) {
      return a
    }
    pow(a * a, b - 1)
  }

  def distance(p1: Point, p2: Point): Double = Math.sqrt((pow(p1.x - p2.x) + pow(p1.y - p2.y)).toDouble)

  def sortFirstIntTuple(tuple: Tuple): Tuple = {
    val (a, b) = tuple
    if (a.isInstanceOf[Int]) {
      return (a, b)
    } else if (b.isInstanceOf[Int]) {
      return (b, a)
    }
    (a, b)
  }

  def addStringTuple(tuple: Tuple): Tuple = {
    val (a, b, c) = tuple
    (a, s""""$a"""", b, s""""$b"""", c, s""""$c"""")
  }

  println(circleArea(5))
  printFiveToFiftyIncrementFive()
  println(toDateString(86400000))
  println(pow(4))
  println(distance(Point(5, 5), Point(10, 10)))
  println(sortFirstIntTuple("가", 1))
  println(addStringTuple("가", 1, true))
}
