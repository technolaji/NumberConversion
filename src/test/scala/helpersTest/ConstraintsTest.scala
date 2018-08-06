package helpersTest

import com.bolajiabiodun.helpers.Constraints
import org.scalatest.FunSuite


class ConstraintsTest extends FunSuite {

  val constraints = new Constraints



  test("WHEN number is passed as a string THEN method should return integer"){
    val arg = "1"
    val actualResult = constraints.convertToInt(arg)
    val expectedResult = 1
    assert(actualResult == expectedResult)
  }

  test("WHEN number isn't passed as a string THEN method should return Exception") {
    val arg = "1,000,000.56"
    intercept[NumberFormatException] {
      constraints.convertToInt(arg)
    }
  }
  test("WHEN number is greater than 999,999,999 THEN method should throw Exception "){
    val arg = "1000000000"
    intercept[NumberFormatException] {
      constraints.convertToInt(arg)
    }
  }

}
