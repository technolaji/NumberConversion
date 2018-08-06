import com.bolajiabiodun.Millions
import org.scalatest.FunSuite

class MillionsTest extends FunSuite{


  val millions = new Millions
  test("WHEN input is 1000000 return one million"){
    val input = 1000000
    val actualResult = millions.getWords(input)
    val expectedResult = "one million"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 1000001 return one million and one"){
    val input = 1000001
    val actualResult = millions.getWords(input)
    val expectedResult = "one million and one"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 1000099 return one million and ninety nine"){
    val input = 1000099
    val actualResult = millions.getWords(input)
    val expectedResult = "one million and ninety nine"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 1000100 return one million one hundred"){
    val input = 1000100
    val actualResult = millions.getWords(input)
    val expectedResult = "one million one hundred"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 20 000 909 return twenty million and nine hundred and nine"){
    val input = 20000909
    val actualResult = millions.getWords(input)
    val expectedResult = "twenty million nine hundred and nine"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 999 999 999 return nine hundred and nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine"){
    val input = 999999999
    val actualResult = millions.getWords(input)
    val expectedResult = "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine"
    assert(actualResult == expectedResult)
  }
}
