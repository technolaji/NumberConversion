package com.bolajiabiodun.helpers

class Constraints(){


  def isNumber(x: Any ) : Boolean = {
    x.isInstanceOf[Integer]
  }

  def isLessThanOneBillion(x:Int) : Boolean = {
    x < 1000000000
  }
}


