package com.andrefms

object book03ListsSequences extends App{
  // Collections classes

  // Populating lists
  val nums = List.range(1, 10)
  val nums1 = (1 to 10 by 2).toList
  val letters1 = ('a' to 'f').toList
  val letters = ('a' to 'f' by 2).toList

  // Sequence methods
  val nums2 = (1 to 10).toList
  val names = List("joel", "ed", "chris", "maurice")

  names.foreach(println)
  nums2.filter(_ < 4).foreach(println)

  val doubles = nums.map(_ * 2)
  println(doubles)
  val capNames = names.map(_.capitalize)
  println(capNames)
  val lessThanFive = nums.map(_ < 5)
  println(lessThanFive)

  println(nums.foldLeft(0)(_ + _))
  println(nums.foldLeft(1)(_ * _))


  // TUPLES
  val t = (11, "Eleven", 5)
}
