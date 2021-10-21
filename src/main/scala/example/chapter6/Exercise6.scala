package example.chapter6

object Exercise6 extends App {
  val list = List range (1, 100, 1) filter (_ % 2 != 0) take 20
  println(list)

  def factors(l: List[Int]): List[Int] = {
    l flatten (x => List range (2, x + 1, 1) filter (x % _ == 0) filter (x != _))
  }

  println(factors(List(9, 11, 13, 15)))

  def first[A](items: List[A], count: Int): List[A] = {
    // short answer = items.take(count)
    var l = List[A]()
    for (i <- 0 until count) {
      l = l :+ items(i)
    }
    l
  }
  println(first(List('a', 't', 'o'), 2))

  def getLongString(l: List[String]): String = l.foldLeft("") { (a, i) => if (a.length > i.length) a else i }
  getLongString("123444" :: "4567" :: Nil)

  def reverse[A](items: List[A]): List[A] = {
    var l = List[A]()
    for (i <- items.size - 1 to 0 by -1) {
      l = l :+ items(i)
    }
    l
  }
  println(reverse("1" :: "2" :: "3" :: Nil))

  def palindrome(l: List[String]): (List[String], List[String]) = {
    l partition (s => s == s.reverse)
  }

  println(palindrome("racecar" :: "aca" :: "kuckjwi" :: Nil))
}
