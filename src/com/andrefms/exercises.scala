package com.rockthejvm

object exercises extends App{
  def sumValues (x: Int, y: Int): Int = {
    if (x == y) (x+y)*3
    else x+y
  }
  println(sumValues(2, 2))

  def difValues (x: Int): Int = {
    if (x > 51) (x-51)*3
    else 51-x
  }
  println(difValues(40))

  def checkNum (x: Int, y: Int): Boolean = {
      x == 30 | y == 30 | (x+y) == 30
  }
  println(checkNum(10,20))

  def checkString(x: String): String = {
    if (x.slice(0,2) == "if") x
    else "if " + x
  }
  println(checkString("if you like me"))

  // Write a Scala program to remove the character in a given position of a given string.
  // The given position will be in the range 0...string length -1 inclusive.
  def removeChar(x: String, y: Int): String = {
    // x.slice(0, y) + x.slice(y+1, x.length)
    x.take(y) + x.drop(y+1)
  }
  println(removeChar("meu nome eh andre", 5))

  //  Write a Scala program to exchange the first and last characters in a given string and return the new string
  def exchangeChar(x:String): String = {
    // x.slice(x.length -1, x.length)  + x.slice(1, x.length-1) + x.take(1)
    x.charAt(x.length - 1) + x.substring(1, x.length - 1) + x.charAt(0)
  }
  println(exchangeChar("andre"))
}
