package example.chapter7

object OptionExample extends App {
  var a = Option("kuckjwi")
  var b = Option(null)
  println(a.isDefined)
  println(a.isEmpty)
  println(b.isDefined)
  println(b.isEmpty)

  def divide(amt: Double, divisor: Double): Option[Double] = {
    if (divisor == 0) None
    else Option(amt / divisor)
  }

  val legit = divide(5, 2)
  println(legit)
  val illegit = divide(3, 0)
  println(illegit)

  val firstOdd = List(1, 3, 5).headOption
  println(firstOdd)

  println(List("kuckjwi", "isis") find (w => w == w.toUpperCase))
  println(List("kuckjwi", "isis") find (w => w == w.toLowerCase))
}
