package com.andrefms

import java.io.FileNotFoundException

object book01 extends App{
  val i = 1
    
  // Match
  val result = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
  }
  println(result)

  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case _ => "Unknown"
  }
  println(getClassAsString("oi"))

  // Try/catch
  try {
    println(getClassAsString("oi"))
  } catch {
    case fnfe: FileNotFoundException => println(fnfe)
  }
}
