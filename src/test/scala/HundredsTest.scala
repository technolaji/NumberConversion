import com.bolajiabiodun.Hundreds
import org.scalatest.FunSuite

class HundredsTest extends FunSuite{

  val hundreds = new Hundreds
  test("WHEN input is 100 THEN function should return one hundred"){
    val input = 100
    val actualResult = hundreds.get(input)
    val expectedResult = "one hundred "
    assert(actualResult == expectedResult)

  }

  test("WHEN input is 101 THEN function should return one hundred and one"){
    val input = 101
    val actualResult = hundreds.get(input)
    val expectedResult = "one hundred and one"
    assert(actualResult == expectedResult)

  }


  test("WHEN input is 999 THEN function should return nine hundred and ninety nine"){
    val input = 101
    val actualResult = hundreds.get(input)
    val expectedResult = "one hundred and one"
    assert(actualResult == expectedResult)

  }




}
