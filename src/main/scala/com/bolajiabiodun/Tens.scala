package com.bolajiabiodun

class Tens {

  val units = new Units

  def getWords(x: Int): String = {

    if (x >= 20)
      x / 10 match {
        case 2 => s"twenty ${units.getWords(x % 10)}"
        case 3 => s"thirty ${units.getWords(x % 10)}"
        case 5 => s"fifty ${units.getWords(x % 10)}"
        case n@_ => s"${units.getWords(n).stripSuffix("t")}ty ${units.getWords(x % 10)}"
      }
    else if (x >= 10)
      x match {
        case 10 => "ten"
        case 11 => "eleven"
        case 12 => "twelve"
        case 13 => "thirteen"
        case 15 => "fifteen"
        case x@_ => s"${units.getWords(x - 10)}teen"
      }
    else{
      units.getWords(x)
    }
  }

}
