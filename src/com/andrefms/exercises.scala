package com.andrefms

object exercises extends App{
  def sumValues (x: Int, y: Int): Int = {
    if (x == y) (x+y)*3
    else x+y
  }


  def difValues (x: Int): Int = {
    if (x > 51) (x-51)*3
    else 51-x
  }


  def checkNum (x: Int, y: Int): Boolean = {
      x == 30 | y == 30 | (x+y) == 30
  }


  def checkString(x: String): String = {
    if (x.slice(0,2) == "if") x
    else "if " + x
  }


  // Write a Scala program to remove the character in a given position of a given string.
  // The given position will be in the range 0...string length -1 inclusive.
  def removeChar(x: String, y: Int): String = {
    // x.slice(0, y) + x.slice(y+1, x.length)
    x.take(y) + x.drop(y+1)
  }


  //  Write a Scala program to exchange the first and last characters in a given string and return the new string
  def exchangeChar(x:String): String = {
    // x.slice(x.length -1, x.length)  + x.slice(1, x.length-1) + x.take(1)
    x.charAt(x.length - 1) + x.substring(1, x.length - 1) + x.charAt(0)
  }


  // Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
  def checkMult(x: Int): Boolean = {
    x % 3 == 0 | x % 7 == 0
  }

  // Write a Scala program to create a new string taking the first 3 characters of a given string
  // and return the string with the 3 characters added at both the front and back. If the given string
  // length is less than 3, use whatever characters are there.
  def exchangeChar2(x: String): String = {
    if (x.length < 3) x
    else x.take(3) + x + x.take(3)
  }

  //  Write a Scala program to test if a given string contains the specified sequence of char values.
  def checkSequence(x: String, y: String): Boolean = {
    x.contains(y)
  }
  println(checkSequence("i'm 24 years old", "old"))
}
