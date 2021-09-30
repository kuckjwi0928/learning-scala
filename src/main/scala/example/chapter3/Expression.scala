package example.chapter3

object Expression extends App {
  val amount = {
    val x = 5 * 20
    x + 10
  }
  println(amount)

  if (47 % 3 > 0) println("47 % 3 > 0") else println("47 % 3 < 1")

  val x = 10
  val y = 20
  val max = x > y match {
    case true => x
    case false => y
  }
  println(max)

  val status = 555

  val message = status match {
    case 200 => "ok"
    case 400 | 500 => {
      println("ERROR")
      "error"
    }
    case _ => println("Unknown")
  }

  for (x <- 1 to 10) {
    println(x)
  }

  for (x <- 1 until 10) {
    println(x)
  }

  println(for (x <- 1 until 10) yield x)

  // iterator guard
  println(for (i <- 1 to 20 if i % 3 == 0) yield i)

  // nested loop
  for {
    x <- 1 to 2
    y <- 1 to 3
  } println(s"$x $y")
}

