package example.chapter1

object Exercise1 extends App {
  val temperature = toFahrenheit(22.0)
  println(temperature)
  println(toCelsius(temperature))
}

def toFahrenheit(temperature: Double) = temperature * 1.8 + 32

def toCelsius(temperature: Double) = (temperature - 32) / 1.8
