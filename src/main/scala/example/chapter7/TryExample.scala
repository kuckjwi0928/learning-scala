package example.chapter7

import scala.util._

object TryExample extends App {
  def loopAndFail(end: Int, failAt: Int): Int = {
    for (i <- 1 to end) {
      println(i)
      if (i == failAt) throw new Exception("Too many iterations")
    }
    end
  }

  println(Try(loopAndFail(10, 3)))
  println(Try(loopAndFail(2, 3)))

  Try(loopAndFail(2, 3)) match {
    case Success(x) => println(x)
    case Failure(ex) => ex.printStackTrace
  }
}
