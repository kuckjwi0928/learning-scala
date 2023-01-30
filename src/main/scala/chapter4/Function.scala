package chapter4

object Function {
  def main(args: Array[String]): Unit = {
    println(safeTrim("   Hello World   "))
    val result = safeTrim {
      val s = " ??? "
      s
    }
    println(result)
    println(power(2, 8))
    println(namedParameterFunction(x = 1, z = 3, y = 1))
    println(sum(1,2,3,4,5,6,7,8,9,10))

    val larger = max(20)(30)
    println(larger)

    println(identity("abc"))
  }

  private def safeTrim(s: String): String = {
    if (s != null) s.trim else s
  }

  @annotation.tailrec
  private def power(x: Int, n: Int, t: Int = 1): Long = {
    if (n < 1) t
    else power(x, n - 1, x * t)
  }

  private def namedParameterFunction(x: Int, y: Int, z: Int): Int = {
    x + y + z
  }

  private def sum(items: Int*): Int = {
    var total = 0
    for (item <- items) {
      total += item
    }
    total
  }

  private def max(x: Int)(y: Int) = if (x > y) x else y

  private def identity[A](a: A): A = a
}
