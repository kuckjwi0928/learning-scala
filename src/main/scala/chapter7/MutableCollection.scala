package chapter7

object MutableCollection {
  def main(args: Array[String]): Unit = {
    val nums = collection.mutable.Buffer(1)
    for (i <- 2 to 10) nums += i
    println(nums)

    val map = Map("AAP" -> 597, "MSFT" -> 40)
      .toBuffer
      .dropInPlace(1)
      .+= ("GOOG" -> 521)

    println(map)

    val setBuilder = Set.newBuilder[Char]
    setBuilder += 'h'
    setBuilder ++= List('e', 'l', 'l', 'o')
    println(setBuilder.result)
  }
}
