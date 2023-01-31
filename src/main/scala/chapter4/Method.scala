package chapter4

object Method {
  def main(args: Array[String]): Unit = {
    val isJPEG = "vacation.jpg".endsWith(".jpg")
    println(isJPEG)

    val d = 65.642
    println(d.round)
    println(d.floor)
    println(d.ceil)
    println(d compare 18.0)
    println(d + 2.721)
  }
}
