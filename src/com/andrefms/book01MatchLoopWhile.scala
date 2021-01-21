package com.andrefms

import java.io.FileNotFoundException

object book01MatchLoopWhile extends App{
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

"""  // for loops
  for (arg <- args) println(arg)

  // "x to y" syntax
  for (i <- 0 to 5) println(i)

  // "x to y by" syntax
  for (i <- 0 to 10 by 2) println(i)

  // for-loop with yield
  val x = for (i <- 1 to 5) yield i * 2"""

  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLengths = for {
    f <- fruits
    if f.length > 4
  } yield f.length
  println(fruitLengths)

  // while and do/while
  """while(condition) {
    statement(a)
    statement(b)
  }

  // do-while
  do {
    statement(a)
    statement(b)
  }
  while(condition)"""
}
