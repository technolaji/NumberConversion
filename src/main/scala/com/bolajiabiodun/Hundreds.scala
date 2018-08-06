package com.bolajiabiodun

class Hundreds {

  val tens = new Tens
  val units = new Units

  def get(x: Int): String ={

    x match {
      case 100 => s"${units.get(x/100)} hundred ${tens.get(x%100)}"
      case _ => s"${units.get(x/100)} hundred and ${tens.get(x%100)}"
    }


  }


}
