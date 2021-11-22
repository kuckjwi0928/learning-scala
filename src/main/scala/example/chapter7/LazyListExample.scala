package example.chapter7

// Scala Stream is deprecated and LazyList is used.
object LazyListExample extends App {
  def inc(head: Int): LazyList[Int] = head #:: inc(head + 1)
  val s = inc(2)
  println(s)

  val l = s.take(5).toList
  println(l)

  // bounded stream
  def to(head: Char, end: Char): LazyList[Char] = (head > end) match {
    case true => LazyList.empty
    case false => head #:: to((head + 1).toChar, end)
  }

  val hexChars = to('A', 'F').take(20).toList
  println(hexChars)
}
