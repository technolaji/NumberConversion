import com.bolajiabiodun.Tens
import org.scalatest.FunSuite

class TensTest extends FunSuite{

  val tens = new Tens
  test("WHEN input is 10 THEN function should return ten"){
    val input = 10
    val actualResult = tens.get(input)
    val expectedResult = "ten"
    assert(actualResult == expectedResult)

  }


  test("WHEN input is 16 THEN function should return sixteen"){
    val input = 16
    val actualResult = tens.get(input)
    val expectedResult = "sixteen"
    assert(actualResult == expectedResult)

  }

  test("WHEN input is 19 THEN function should return nineteen"){
    val input = 19
    val actualResult = tens.get(input)
    val expectedResult = "nineteen"
    assert(actualResult == expectedResult)

  }


}
