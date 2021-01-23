package com.andrefms

object book10Set extends App {
  // Set
  // The Scala Set class is an iterable collection with no duplicate elements.
  // Scala has both mutable and immutable Set classes.
  // To use a mutable Set, first import it:
  val set = scala.collection.mutable.Set[Int]()
  // You add elements to a mutable Set with the +=, ++=, and add methods.
  set += 1
  set += 2 += 3
  set ++= Vector(4, 5)
}
