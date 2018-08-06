package com.bolajiabiodun

import com.bolajiabiodun.helpers.Constraints


object NumberConverter extends App {


  override def main(args: Array[String]): Unit = {
    val rawNumber = scala.io.StdIn.readLine("Please enter the number you want converted \n")

    val numberOfDigits = rawNumber.length

    val constraints = new Constraints


    val number = constraints.checkAssumptions(rawNumber)

    val units = new Units
    val tens = new Tens
    val hundreds = new Hundreds
    val thousands = new Thousands
    val millions = new Millions

    numberOfDigits match {

      case 9 => print(millions.getWords(number))
      case 8 => print(millions.getWords(number))
      case 7 => print(millions.getWords(number))
      case 6 => print(thousands.getWords(number))
      case 5 => print(thousands.getWords(number))
      case 4 => print(thousands.getWords(number))
      case 3 => print(hundreds.getWords(number))
      case 2 => print(tens.getWords(number))
      case 1 => print(units.getWords(number))
    }

  }


}
