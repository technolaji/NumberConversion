package com.bolajiabiodun

class Tens {


  val units = new Units

  def get(x: Int): String = {

    x match {
      case 10 => "ten"
      case 11 => "eleven"
      case 12 => "twelve"
      case 13 => "thirteen"
      case 15 => "fifteen"
      case n@_ => s"${units.get(n - 10)}teen"
    }
  }

}
