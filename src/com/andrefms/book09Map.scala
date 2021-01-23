package com.andrefms
import scala.collection.mutable.Map

object book09Map extends App {
  // Map
  // The Map class documentation describes a Map as an iterable sequence that consists of pairs of keys and values.
  val states = Map(
    "AK" -> "Alaska",
    "IL" -> "Illinois",
    "KY" -> "Kentucky"
  )
  // Scala has both mutable and immutable Map classes.
  // To use mutable: import scala.collection.mutable.Map
  val statess = collection.mutable.Map("AK" -> "Alaska")
  //Now you can add a single element to the Map with +=, like this:
  statess += ("AL" -> "Alabama")
  statess += ("AR" -> "Arkansas", "AZ" -> "Arizona")
  // You can add elements from another Map using ++=:
  statess ++= Map("CA" -> "California", "CO" -> "Colorado")

  // You remove elements from a Map using -= and --= and specifying the key values,
  states -= "AR"
  states -= ("AL","AZ")
  states --= List("AL", "AZ")

  // You update Map elements by reassigning their key to a new value:
  states("AK") = "Alaska, A Really Big State"

  // There are several different ways to iterate over the elements in a map. Given a sample map:
  for ((k,v) <- statess) println(s"key: $k, value: $v")

  states.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
  }

  // how to get the keys from a Map
  val keys = states.keys
  // how to get the values from a Map
  val values = states.values
}
