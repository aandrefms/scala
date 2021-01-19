package com.rockthejvm

object Basics extends App{
  // defining a value
  val meaningOfLife: Int = 42
  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional
  // Strings
  val aString = "I love Scala"
  val aComposedString = "I" + " " + "Love" + " " + "Scala"
  // This is like python f strings
  val anInterpolatedString = s"The Meaning of Life is $meaningOfLife"

  // Expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  // if-expression
  val ifExpression = if(meaningOfLife > 43) 56 else 999
  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

  // Code Blocks
  val aCodeBlock = {
    // definitions
    val aLocalValue = 67

    // Value of the block is the last expression
    aLocalValue + 3
  }

  // define a function
  // def myFunction (x: Int, y:String): String = y + " " + x
  def myFunction (x: Int, y:String): String = {
    y + " " + x
  }

  println(myFunction(4, "oi bebe"))
  // recursive functions
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial (n - 1)

  // In scala, we don't use loops or iterations, we use RECURSION!

  // The unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS

  def myUnitReturningFunction(): Unit = (
    println("I don't love returning unit")
  )

  val theUnit = ()
}
