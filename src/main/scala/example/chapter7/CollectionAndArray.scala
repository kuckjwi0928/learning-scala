package example.chapter7

object CollectionAndArray extends App {
  val m = Map("AAPL" -> 597, "MSFT" -> 40)
  val n = m - "AAPL" + ("GOOG" -> 521)
  println(n)

  val nums = collection.mutable.Buffer(1)

  for (i <- 2 to 10) nums += i

  println(nums)
  // immutable
  println(nums.toList)

  val m2 = m.toBuffer
  println(m2 dropInPlace 1)
  m2 += ("GOOD" -> 521)
  println(m2)
  // immutable
  println(m2.toMap)

  m2 += ("GOOD" -> 521)
  println(m2.toList)
  println(m2.toSet)

  val b = Set.newBuilder[Char]
  b += 'h'
  b ++= List('e', 'l', 'l', 'o')
  println(b.result)

  // array
  val colors = Array("red", "green", "blue")
  colors(0) = "purple"
  println(colors(0))
  val files = new java.io.File("./src/main/scala/example/chapter7").listFiles
  val scalaFiles = files map (_.getName) filter (_ endsWith ".scala")
  println(scalaFiles(0))
}
