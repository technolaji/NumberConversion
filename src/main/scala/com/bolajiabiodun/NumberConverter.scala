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

    numberOfDigits match {
      case 3 => print(hundreds.get(number))
      case 2 => print(tens.get(number))
      case 1 => print(units.get(number))
    }
  }


}
