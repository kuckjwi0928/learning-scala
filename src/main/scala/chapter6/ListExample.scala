package chapter6

object ListExample {
  def main(args: Array[String]): Unit = {
    val numbers = List(32, 95, 24, 21, 17)
    println(numbers.head)
    println(numbers.tail)
    println(numbers(1))

    for (c <- numbers) {
      println(c)
    }

    println(numbers.map((c: Int) => c * c))

    var i = List("A", "B", "C")

    while (i != Nil) {
      println(i.head)
      i = i.tail
    }

    println(1 :: 2 :: 3 :: Nil)
    println(23 :: 8 :: 14 :: 21 :: Nil filter (_ > 10))
    println("apple" :: "to" :: Nil sortBy (_.length))

    val appended = List(1, 2, 3, 4) :+ 5
    println(appended takeRight 3)
    println(appended dropRight 2)

    val statuses = List(200, 404)
    val msg = statuses.head match {
      case x if x < 500 => "okay"
      case _ => "whoah, an error"
    }
    println(msg)
  }
}
