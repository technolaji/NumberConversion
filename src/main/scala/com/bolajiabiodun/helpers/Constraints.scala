package com.bolajiabiodun.helpers

import scala.util.{Failure, Success, Try}

class Constraints(){

  def isNumber(x: Any ) : Boolean = {
    x.isInstanceOf[Integer]
  }

  def isLessThanOneBillion(x:Int) : Boolean = {
    x < 1000000000
  }

  def convertToInt(x: String): Any = {
    Try(x.toInt) match {
      case Success(value) => value
      case Failure(exception) => throw exception
    }
  }

}


