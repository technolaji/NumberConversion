package com.bolajiabiodun

class Hundreds {

  val tens = new Tens

  def get(x: Int): String = {

    if (x > 100) {
      s"${get(x / 100)} hundred and ${tens.get(x % 100)}"
    }
    else if (x == 100) {
      s"${get(x / 100)} hundred ${tens.get(x % 100)}"
    }
    else {
      tens.get(x)
    }

  }
}