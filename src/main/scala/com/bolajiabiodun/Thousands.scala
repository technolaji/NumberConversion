package com.bolajiabiodun

class Thousands {

  val hundreds = new Hundreds
  val tens = new Tens
  val units = new Units

  def get(x: Int): String = {

    if(x > 1100){
      s"${get(x / 1000)} thousand ${get(x % 1000)}"
    }
    else if (x > 1000)
      s"${get(x / 1000)} thousand and " +
        s"${tens.get(x % 1000)}"

    else if (x == 1000){
      s"${get(x / 1000)} thousand ${tens.get(x % 1000)}"
    }
    else
      hundreds.get(x)
  }

}
