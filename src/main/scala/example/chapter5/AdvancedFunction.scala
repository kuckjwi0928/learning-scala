package example.chapter5

object AdvancedFunction extends App {
  def double(x: Int): Int = x * 2

  val myDouble = double _
  println(myDouble(2))

  def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
  }
  def reverser(s: String) = s.reverse

  println(safeStringOp(null, reverser))
  println(safeStringOp("Ready", reverser))

  val doubler = (x: Int) => x * 2
  val max = (a: Int, b: Int) => if (a > b) a else b
  println(doubler(2))
  println(max(100, 101))
  println(safeStringOp("Ready", s => s.reverse))

  val doubler2: Int => Int = _ * 2
  println(doubler2(2))
  println(safeStringOp("Ready", _.reverse))

  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)
  println(combination(23, 24, _ - _))

  def tripleOp[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)
  println(tripleOp(23, 92, 14, _ * _ + _))

  def factorOf(x: Int, y: Int) = y % x == 0
  val mutiple = factorOf(3, _)
  println(mutiple(78))

  // currying
  def factorOf2(x: Int)(y: Int) = y % x == 0
  val isEven = factorOf2(2) _
  println(isEven(32))
}
