package example.chapter6

object Collection extends App {
  val numbers = List[Int](32, 95, 24, 21, 17)
  println(numbers.size)
  println(numbers.head)
  println(numbers.tail)
  println(numbers(1))

  for (num <- numbers) { println(num) }

  println(numbers.map(num => num * num).reduce((a, b) => a + b))

  val unique = Set(10, 20, 30, 20, 20, 10)
  println(unique)
  println(unique.reduce((a, b) => a + b))

  val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
  println(colorMap)
  println(colorMap("red"))
  val cyanRGB = colorMap("green") | colorMap("blue")
  println(cyanRGB)
  println(colorMap.contains("white"))
  for (pairs <- colorMap) { println(pairs) }

  val l: List[String] = List("a")
  println(l.head)
  println(l.tail == Nil)

  val l2 = 1 :: 2 :: 3 :: Nil
  println(l2)

  val first = Nil.::(1)
  println(first)
  val second = 2 :: first
  println(second)

  println("###")
  println(List(1, 2) ::: List(2, 3))
  println(List(1, 2) ++ Set(3, 4, 3))
  println(List(1, 2) == List(1, 2))
  println(List(3, 5, 4, 3, 4).distinct)
  println(List(3, 5, 4, 3, 4) drop 2)
  println(List(3, 5, 4, 3, 4) filter (_ >= 4))
  println(List(List(1, 2), List(3, 4)).flatten)
  println(List(1, 2, 3, 4, 5) partition (_ < 3))
  println(List(1, 2, 3).reverse)
  println(List(2, 3, 5, 7) slice (1, 3))
  println(List("apple", "to") sortBy (_.size))
  println(List("apple", "to").sorted)
  println(List(1, 2, 3, 4, 5) splitAt 2)
  println(List(1, 2, 3, 4, 5) take 3)
  println(List(1, 2) zip List("a", "b"))
}
