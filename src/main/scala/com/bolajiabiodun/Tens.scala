package com.bolajiabiodun

class Tens {

  val units = new Units

  def get(x: Int): String = {
    if (x >= 20)
      x / 10 match {
        case 2 => s"twenty ${units.get(x%10)}"
        case 3 => s"thirty ${units.get(x%10)}"
        case 5 => s"fifty ${units.get(x%10)}"
        case n@_=> s"${units.get(n).stripSuffix("t")}ty ${units.get(x%10)}"
      }
    else x match {
      case 10 => "ten"
      case 11 => "eleven"
      case 12 => "twelve"
      case 13 => "thirteen"
      case 15 => "fifteen"
      case x@_ => s"${units.get(x - 10)}teen"
    }
  }

}
