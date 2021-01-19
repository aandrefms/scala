package com.rockthejvm

object FunctionalProgramming extends App {

  // Scala is OO
  class Person(name: String) {
    def apply(age: Int) = println(s"I have aged $age years")
  }

  val bob = new Person("bob")
  bob(43)
  bob.apply(43)

  /*
    Scala runs on the JVM
    Functional Programming:
    - compose functions
    - pass functions as arguments
    - return function as results

    Conclusion: FunctionX = Function1, Function2, ..., Function22
   */

  val simpleIncrementer = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }
  simpleIncrementer(23)
  // defined a function

  // ALL SCALA FUNCTIONS ARE INSTANCES OF THESE FUNCTION_X TYPES

  // Function with 2 arguments and a String return type
  val stringConcatenator = new Function2[String, String, String] {
    override def apply(arg1: String, arg2: String): String = arg1 + arg2
  }
  println(stringConcatenator("I love", " Scala"))


  // syntax sugars
  val doubler: Int => Int = (x: Int) => 2 * x
  println(doubler(4))
  /*
    Equivalent to the much longer:
    val doubler: new Function1[Int, Int] {
      override def apply(x: Int) = 2 * x
    }
   */

  // higher order functions: take functions as arguments/ return functions as results
  val aMapped = List(1, 2, 3).map(x => x + 1) // map is a HOF
  // val aFlatMappedList = List(1,2,3).flatMap(x => List(x, 2 * x)) // flatmap is a HOF
  val aFlatMappedList = List(1, 2, 3).flatMap { // alternative syntax
    x => List(x, 2 * x)
  }
  println(aFlatMappedList)
  val aFilteredList = List(1, 2, 3, 4).filter {
    _ <= 3 // Equivalent to x => x <= 3
  }
  println(aFilteredList)

  // all pairs between the numbers 1,2,3 and the letters 'a','b','c'
  val allPairs = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number - $letter"))
  println(allPairs)

  // for comprehensions
  val alternativePairs = for {
    number <- List(1, 2, 3)
    letter <- List('a', 'b', 'c')
  } yield s"$number - $letter"
  // equivalent to the map/flatmap chain above

  /**
   * Collections
   */
  // lists
  val aList = List(1, 2, 3, 4, 5)
  val firstElement = aList.head
  val rest = aList.tail
  val aPrependedList = 0 :: aList // List(0,1,2,3,4,5)
  val anExtendedList = 0 +: aList :+ 6 // List(0,1,2,3,4,5,6)

  // sequences
  val aSequence: Seq[Int] = Seq(1, 2, 3) // Seq.apply(1,2,3)
  val accessedElement = aSequence(1) // the element of index 1 (2, in this case)

  // vector: Fast Seq implementation
  val aVector = Vector(1, 2, 3, 4, 5)

  // sets =  no duplication
  val aSet = Set(1, 2, 3, 4, 5, 1, 2, 3) // Set(1,2,3,4,5)
  val setHas5 = aSet.contains(5) // true
  val anAddedSet = aSet + 6 // Set(1,2,3,4,5,6)
  val aRemovedSet = aSet - 3 // Set(1,2,4,5)

  // ranges
  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2 * x).toList // List(2,4,6,8,...,2000)

  // tuples = groups of values under the same values
  val aTuple = ("Bon Jovi", "Rock", 1982)

  // maps
  val aPhoneBook: Map[String, Int] = Map(
    ("Daniel", 9128491),
    "Jane" -> 984911 // equivalent to ("Jane", 984911)
  )
}