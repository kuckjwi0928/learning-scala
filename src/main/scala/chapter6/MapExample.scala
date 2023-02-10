package chapter6

object MapExample {
  def main(args: Array[String]): Unit = {
    val colorMap = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    println(colorMap)
    println(colorMap("red"))
    println(colorMap contains "red")
    for (pairs <- colorMap) {
      println(pairs)
    }
  }
}
