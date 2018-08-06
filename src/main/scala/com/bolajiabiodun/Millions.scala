package com.bolajiabiodun

class Millions {


  val thousands = new Thousands

  def getWords(x: Int): String = {

    if (x > 1000099){
      s"${getWords(x/1000000)} million ${thousands.getWords(x%1000000)}"
    }
    else if (x > 1000000){
      s"${getWords(x/1000000)} million and ${thousands.getWords(x%1000000)}"

    }
    else if(x == 1000000){
      s"${getWords(x/1000000)} million"
    }
    else {
      thousands.getWords(x)
    }


  }
}
