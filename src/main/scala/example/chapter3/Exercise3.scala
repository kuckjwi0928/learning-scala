package example.chapter3

object Exercise3 extends App {
  val name = ""
  name match {
    case "" => println("n/a")
    case _ => println(name)
  }
  println(name)

  val amount: Double = 1.0
  amount match {
    case x if x > 0 => println("greater")
    case x if x < 0 => println("less")
    case _ => println("same")
  }

  for (x <- 1 until 100) {
    if (x % 5 == 0) {
      println()
    }
    print(s"$x${if (x == 99) "" else ", "}")
  }

  for (x <- 1 until 100 if (x % 3 == 0 || x % 5 == 0)) {
    if (x % 3 == 0 && x % 5 == 0) {
      println("typesafe")
    } else if (x % 3 == 0) {
      println("type")
    } else {
      println("safe")
    }
  }
}
