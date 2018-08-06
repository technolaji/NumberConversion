package com.bolajiabiodun

class Hundreds {

  val tens = new Tens

  def getWords(x: Int): String = {

    if (x > 100) {
      s"${getWords(x / 100)} hundred and ${tens.getWords(x % 100)}"
    }
    else if (x == 100) {
      s"${getWords(x / 100)} hundred ${tens.getWords(x % 100)}"
    }
    else {
      tens.getWords(x)
    }

  }
}