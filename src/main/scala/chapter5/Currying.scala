package chapter5

object Currying {
  def main(args: Array[String]): Unit = {
    val isEven = factorOf(2) _
    val z = isEven(32)
    println(z)
  }

  def factorOf(x: Int)(y: Int) = y % x == 0
}
