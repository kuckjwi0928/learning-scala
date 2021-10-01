package example.chapter4

object Function extends App {
  def hi = "hi"

  def multiplier(x: Int, y: Int) = x * y

  def safeTrim(s: String): String = {
    if (s == null) return null
    s.trim
  }

  @annotation.tailrec
  def power(x: Int, n: Int, t: Int = 1): Long = {
    if (n < 1) t
    else power(x, n - 1, x * t)
  }

  def greet(prefix: String, name: String) = s"$prefix $name"

  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }

  def max(x: Int)(y: Int) = if (x > y) x else y

  def identity[A](a: A) = a

  println(hi)
  println(multiplier(2, 2))
  println(safeTrim(null))
  println(safeTrim(" abc "))
  println(safeTrim({ "a" + "b" + "c" }))
  println(power(2, 31))
  println(greet(name = "kuckhwan", prefix = "cho"))
  println(sum(1,2,3,4,5,6,7,8,9,10))
  println(max(20)(39))
  println(identity[String]("10"))
  println(identity[Double](10.0))
}
