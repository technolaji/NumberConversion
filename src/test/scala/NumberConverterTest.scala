import com.bolajiabiodun.NumberConverter
import org.scalatest.FunSuite



class NumberConverterTest extends FunSuite{


  test("WHEN input is a number THEN returns words") {
    val input: Array[String] = Array("1234")
    val actualResult = NumberConverter.main(input)
    val expectedResult = "one thousand two hundred and thirty four"
    assert(actualResult == expectedResult)
  }





}
