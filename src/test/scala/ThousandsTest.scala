import com.bolajiabiodun.Thousands
import org.scalatest.FunSuite

class ThousandsTest extends FunSuite{


  val thousands = new Thousands

  test("WHEN input is 1000 returns one thousand"){
    val input: Int = 1000
    val actualResult = thousands.getWords(input)
    val expectedResult ="one thousand "
    assert(actualResult == expectedResult)
  }


  test("WHEN input is 1101 returns one thousand one hundred and one"){
    val input: Int = 1101
    val actualResult = thousands.getWords(input)
    val expectedResult ="one thousand one hundred and one"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 1001 returns one thousand and one"){
    val input: Int = 1001
    val actualResult = thousands.getWords(input)
    val expectedResult ="one thousand and one"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 1099 returns one thousand and ninety nine"){
    val input: Int = 1099
    val actualResult = thousands.getWords(input)
    val expectedResult ="one thousand and ninety nine"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 10001 returns ten thousand and one"){
    val input: Int = 10001
    val actualResult = thousands.getWords(input)
    val expectedResult ="ten thousand and one"
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 89875 returns eighty nine thousand eight hundred and one"){
    val input: Int = 89875
    val actualResult = thousands.getWords(input)
    val expectedResult ="eighty nine thousand eight hundred and seventy five"
    assert(actualResult == expectedResult)
  }


  test("WHEN input is 101000 returns one hundred and one thousand"){
    val input: Int = 101000
    val actualResult = thousands.getWords(input)
    val expectedResult ="one hundred and one thousand "
    assert(actualResult == expectedResult)
  }

  test("WHEN input is 999999 returns nine hundred and ninety nine thousand nine hundred and ninety nine"){
    val input: Int = 999999
    val actualResult = thousands.getWords(input)
    print(actualResult)
    val expectedResult ="nine hundred and ninety nine thousand nine hundred and ninety nine"
    assert(actualResult == expectedResult)
  }
}
