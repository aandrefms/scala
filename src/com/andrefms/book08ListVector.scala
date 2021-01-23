package com.andrefms

object book08ListVector extends App {
  // List
  // The List class is a linear, immutable sequence. All this means is that it’s a linked-list that you can’t modify.
  // Any time you want to add or remove List elements, you create a new List from an existing List.
  val ints = List(1, 2, 3)
  val names = List("Joel", "Chris", "Ed")
  // You can also declare the List’s type, if you prefer, though it generally isn’t necessary:
  val ints1: List[Int] = List(1, 2, 3)

  // Because List is immutable, you can’t add new elements to it.
  // Instead you create a new list by prepending or appending elements to an existing List
  val new_int = ints :+ 4 // append
  val new_int1 = 0 +: ints // prepend

  // Vector
  // The Vector class is an indexed, immutable sequence. The “indexed” part of the description
  // means that you can access Vector elements very rapidly by their index value, such as accessing listOfPeople(999).
  val nums = Vector(1, 2, 3, 4, 5)
  val strings = Vector("one", "two")
  println(strings(1))

}
