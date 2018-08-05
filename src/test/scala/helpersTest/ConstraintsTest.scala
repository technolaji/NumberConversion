package helpersTest

import com.bolajiabiodun.helpers.Constraints
import org.scalatest.FunSuite


class ConstraintsTest extends FunSuite {

  val constraints = new Constraints


  test("WHEN argument is a number THEN method should return true"){
    val arg = 4
    val actualResult = constraints.isNumber(arg)
    val expectedResult = true
    assert(actualResult == expectedResult)
  }

  test("WHEN argument is a character THEN method should return false "){
    val arg = "arg"
    val actualResult = constraints.isNumber(arg)
    val expectedResult = true
    assert(actualResult == expectedResult)
  }


}
