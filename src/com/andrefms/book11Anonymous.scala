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
  println(aMapped)
}
