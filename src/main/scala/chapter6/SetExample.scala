package chapter6

object SetExample {
  def main(args: Array[String]): Unit = {
    val unique = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sum = unique.sum
    println(sum)
  }
}
