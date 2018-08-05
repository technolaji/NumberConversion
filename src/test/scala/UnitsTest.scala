import com.bolajiabiodun.Units
import org.scalatest.FunSuite


class UnitsTest extends FunSuite {

  val units = new Units

  test("WHEN input is 6 THEN function should return six") {

    val input = 6
    val actualResult = units.get(input)
    val expectedResult = "six"
    assert(actualResult == expectedResult)

  }






}
