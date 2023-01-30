package chapter3

object Expression {
  def main(args: Array[String]): Unit = {
    val amount = {
      val x = 5 * 20
      x + 10
    }
    println(amount)

    val x = 10
    val y = 20
    val max = if (x > y) x else y
    println(max)

    val status = 500
    val message = status match {
      case 200 => "ok"
      case 400 => "bad request"
      case 500 => "error"
      case _ => "unknown"
    }
    println(message)

    val day = "MON"
    val kind = day match {
      case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
      case "SAT" | "SUN" => "weekend"
    }
    println(kind)

    val response = null
    response match {
      case s if s != null => println(s)
      case _ => println("null")
    }
  }
}
