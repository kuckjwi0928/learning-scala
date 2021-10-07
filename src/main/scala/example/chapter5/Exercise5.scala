package example.chapter5

case class Point(x: Int, y: Int)

object Exercise5 extends App {
  val max = (a: Int, b: Int) => if (a > b) a else b
  println(max(5, 10))

  val random1, random2, random3 = util.Random.nextInt(10)

  def randomMax(a: Int, b: Int, c: Int, d: Int, e: Int)(f: (Int, Int) => Int): Int = {
    val max = f(f(a, b), f(b, c))
    if (max > e) max else e
  }
  println(randomMax(random1, random2, random3, 4, 5){ (a, b) => if (a > b) a else b })

  def pow(a: Int) = (b: Int) => a * b
  println(pow(2)(4))

  def square(m: Double) = m * m
  val sq = square _
  println(sq(2))

  def conditional[A](x: A)(p: A => Boolean)(f: A => A) = {
    if (p(x)) f(x) else x
  }
  println(conditional(2){x => x == 2}{x => x * x})

  for (i <- 1 to 100) {
    conditional(i){x => x % 3 == 0 && x % 5 == 0}{x => println("typesafe"); x}
    conditional(i){x => x % 5 != 0 && x % 3 == 0}{x => println("type"); x}
    conditional(i){x => x % 3 != 0 && x % 5 == 0}{x => println("safe"); x}
  }
}
