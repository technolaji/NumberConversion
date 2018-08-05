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
    val arg = "testArg"
    val actualResult = constraints.isNumber(arg)
    val expectedResult = false
    assert(actualResult == expectedResult)
  }

  test("WHEN argument contains decimals THEN method should return false "){
    val arg = 3.5
    val actualResult = constraints.isNumber(arg)
    val expectedResult = false
    assert(actualResult == expectedResult)
  }

  test("WHEN number is greater than 999,999,999 THEN method should return false "){
    val arg = 1000000000
    val actualResult = constraints.isLessThanOneBillion(arg)
    val expectedResult = false
    assert(actualResult == expectedResult)
  }



}
