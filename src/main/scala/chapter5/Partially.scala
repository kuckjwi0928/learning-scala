package chapter5

object Partially {
  def main(args: Array[String]): Unit = {
    val multipleOf3 = factorOf(3, _: Int)
    println(multipleOf3(9))

    val statusHandler: Int => String = {
      case 200 => "Okay"
      case 400 => "Your Error"
      case 500 => "Our Error"
    }

    println(statusHandler(200))
  }

  def factorOf(x: Int, y: Int) = y % x == 0
}
