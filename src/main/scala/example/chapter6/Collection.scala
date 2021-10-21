package example.chapter6

import scala.jdk.CollectionConverters._

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

  println("###")
  val list = List(1, 2, 3, 4) :+ 5
  println(list takeRight 3)
  println(list dropRight 2)
  println(List(0, 1, 0) collect { case 1 => "ok" })
  println(List("milk,tea") flatMap (_.split(',')))
  println(List("milk", "tea") map (_.toUpperCase()))

  println("###")
  val validations = List(true, true, false, true, true, true)
  println(!(validations contains false))
  println(validations forall (_ == true))
  println(validations exists (_ == false))

  def reduceOp[A,B](l: List[A], start: B)(f: (B, A) => B): B = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }

  val included = reduceOp(List(46, 19, 92), false) { (a, i) => if (a) a else (i == 19) }
  println(included)

  val answer = reduceOp(List(46, 19, 92), 0.0)(_ + _)
  println(answer)

  println("###")
  println(List(46, 19, 92).reduce(_ + _))
  println(List(46, 19, 92).scan(10)(_ + _))
  println(List(46, 19, 92).foldLeft(false) { (a, i) => if (a) a else i == 19 })
  println(List(11.3, 23.5, 7.2).reduceLeft(_ + _))
  println(List(24, 99, 104).mkString(", "))
  println(List('F', 'T').toBuffer)
  println(Map("a" -> 1, "b" -> 2).keys)
  println(Map("a" -> 1, "b" -> 2).values)
  println(Map("a" -> 1, "b" -> 2).toList)
  println(List(2, 5, 5, 3, 2).toSet)
  println(List(12, 29).asJava)

  val statuses = List(500, 404)
  val msg = statuses match {
    case x if x contains(500) => "has error"
    case _ => "okay"
  }
  println(msg)

  val msg2 = statuses match {
    case List(500, x) => s"Error followed by $x"
    case List(e, x) => s"$e was followed by $x"
  }
  println(msg2)

  val head = List('r', 'g', 'b') match {
    case x :: xs => x
    case nil => ' '
  }
  println(head)

  val code = ('h', 204, true) match {
    case(_, _, false) => 501
    case('c', _, true) => 302
    case('h', x, true) => x
  }
  println(code)
}
