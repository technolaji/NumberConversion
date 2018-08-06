import com.bolajiabiodun.Tens
import org.scalatest.FunSuite

class TensTest extends FunSuite{

  val tens = new Tens
  test("WHEN input is 10 THEN function should return ten"){
    val input = 10
    val actualResult = tens.getWords(input)
    val expectedResult = "ten"
    assert(actualResult == expectedResult)

  }


  test("WHEN input is 16 THEN function should return sixteen"){
    val input = 16
    val actualResult = tens.getWords(input)
    val expectedResult = "sixteen"
    assert(actualResult == expectedResult)

  }

  test("WHEN input is 19 THEN function should return nineteen"){
    val input = 19
    val actualResult = tens.getWords(input)
    val expectedResult = "nineteen"
    assert(actualResult == expectedResult)

  }

  test("WHEN input is 20 THEN function should return twenty") {
    val input = 20
    val actualResult = tens.getWords(input)
    val expectedResult = "twenty "
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 26 THEN function should return twenty six") {
    val input = 26
    val actualResult = tens.getWords(input)
    val expectedResult = "twenty six"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 50 THEN function should return fifty") {
    val input = 50
    val actualResult = tens.getWords(input)
    val expectedResult = "fifty "
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 60 THEN function should return sixty") {
    val input = 60
    val actualResult = tens.getWords(input)
    val expectedResult = "sixty "
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 78 THEN function should return seventy eight") {
    val input = 78
    val actualResult = tens.getWords(input)
    val expectedResult = "seventy eight"
    assert(actualResult == expectedResult)
  }

}
