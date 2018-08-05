package com.bolajiabiodun.helpers

import scala.util.{Failure, Success, Try}

class Constraints(){


  def checkAssumptions(x: String): AnyVal = {

    val number = convertToInt(x)
    isLessThanOneBillion(number)
  }

  def isLessThanOneBillion(x:Int) : AnyVal = {
    if (x < 1000000000) {
      x
    }
  }

  def convertToInt(x: String): Int = {
    Try(x.toInt) match {
      case Success(value) => value
      case Failure(exception) => throw exception
    }
  }

}


