package com.andrefms

object book11Anonymous extends App{
  // for reference https://docs.scala-lang.org/overviews/collections-2.13/seqs.html
  // map
  val ints = List(1,2,3)
  val doubledInts = ints.map(_ * 2)


  // filter
  val ints2 = List.range(1, 10)
  val x = ints2.filter(_ % 2 == 0)
  val y = ints2.filter(_ % 3 == 0).map(_ * 3)


  val allPairs = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number - $letter"))
  val aMapped = List(1, 2, 3).map(x => x + 1) // or: List(1, 2, 3).map(_ + 1)



  // No NULL Values
  // You don’t use null values in FP. Scala’s solution is to use constructs like the Option/Some/None classes.
  // First attempt to deal with parseInt problem:
  def toInt(s: String): Int = {
    try {
      Integer.parseInt(s.trim)
    } catch {
      case e: Exception => 0
    }
  }
  // Better Solution:
  def toInt2(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }
  // I've to use match expression or for-loops to handle Option output Type
  toInt2("25") match {
    case Some(i) => println(i)
    case None => println("That didn't work!")
  }
}
