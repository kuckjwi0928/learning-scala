package chapter3

object Loop {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 7) {
      println(x)
    }

    val result = for (x <- 1 to 7) yield {
      s"Day $x:"
    }
    for (day <- result) {
      println(day)
    }

    val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
    println(threes)

    for {
      x <- 1 to 2
      y <- 1 to 3
    } {
      println(s"($x, $y)")
    }

    val powerOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
    println(powerOf2)
  }
}
