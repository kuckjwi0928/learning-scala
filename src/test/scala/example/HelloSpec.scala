package example

import example.chapter1.Exercise1
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Exercise1.greeting shouldEqual "hello"
  }
}
