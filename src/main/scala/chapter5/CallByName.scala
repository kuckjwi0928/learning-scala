package chapter5

object CallByName {
  def main(args: Array[String]): Unit = {
    println(doubles(5))
    println(doubles(f(10)))
  }

  def f(i: Int) = { println(s"Hello from f($i)"); i }

  def doubles(x: => Int) = {
    println("Now doubling" + x)
    x * 2
  }
}
