package com.bolajiabiodun

class Thousands {

  val hundreds = new Hundreds
  val tens = new Tens
  val units = new Units

  def getWords(x: Int): String = {

    if(x > 1100){
      s"${getWords(x / 1000)} thousand ${getWords(x % 1000)}"
    }
    else if (x > 1000)
      s"${getWords(x / 1000)} thousand and " +
        s"${tens.getWords(x % 1000)}"

    else if (x == 1000){
      s"${getWords(x / 1000)} thousand ${tens.getWords(x % 1000)}"
    }
    else
      hundreds.getWords(x)
  }

}
