package com.bolajiabiodun

import com.bolajiabiodun.helpers.Constraints


object NumberConverter extends App {

  override def main(args: Array[String]): Unit = {
    val rawNumber = scala.io.StdIn.readLine("Please enter the number you want converted \n")

    val constraints = new Constraints
    val number = constraints.checkAssumptions(rawNumber)

    print(number)
  }


}
