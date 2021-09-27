package example.chapter2

object Exercise2 extends App {
  println(toCelsius(toFahrenheit(22.0)).toInt)
  val d: Double = 2.7255
  println(f"$d%2.2f")
  println(!true)
  val num: Int = 128
  println(num.toChar.toInt)
  println(num.toString.toInt)
  println(num.toDouble.toInt)
}

def toFahrenheit(temperature: Double) = temperature * 1.8 + 32

def toCelsius(temperature: Double) = (temperature - 32) / 1.8
