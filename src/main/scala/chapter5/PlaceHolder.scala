package chapter5

object PlaceHolder {
  def main(args: Array[String]): Unit = {
    val doubler: Int => Int = _ * 2
    println(doubler(5))
    println(tripleOp[Int, Int](23, 92, 14, _ * _ + _))
    println(tripleOp[Int, Double](23, 92, 14, 1.0 * _ / _ / _))
    println(tripleOp[Int, Boolean](93, 92, 14, _ > _ + _))
  }

  def tripleOp[A,B](a: A, b: A, c: A, f: (A, A, A) => B): B = f(a,b,c)
}
