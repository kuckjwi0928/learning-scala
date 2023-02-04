package chapter5

object FunctionType {
  def main(args: Array[String]): Unit = {
    val myDouble = double _
    println(myDouble(2))
  }

  def double(x: Int): Int = x * 2
}
