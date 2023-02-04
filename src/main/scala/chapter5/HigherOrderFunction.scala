package chapter5

import java.util.UUID

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    val timedUUID = safeStringOp(UUID.randomUUID.toString) { s =>
      val now = System.currentTimeMillis
      val timed = s.take(24) + now
      timed.toUpperCase
    }
    println(timedUUID)

    timer {
      util.Random.setSeed(System.currentTimeMillis())
      for (_ <- 1 to 10000) util.Random.nextDouble
      println(util.Random.nextDouble)
    }
  }

  def safeStringOp(s: String)(op: String => String) = {
    if (s != null) op(s) else s
  }

  def timer[A](f: => A) = {
    val start = System.currentTimeMillis
    f
    println(s"Executed in ${System.currentTimeMillis - start}ms")
  }
}
