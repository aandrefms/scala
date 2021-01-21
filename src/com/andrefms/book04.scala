package com.andrefms

object book04 extends App {
  val ratings = Map (
    "Inception" -> 10.0,
    "Forever Alice" -> 0,
  )
  ratings.foreach {
    case(name, rating) => println(s"Movie $name is a $rating")
  }
  val nums = List(1,2,3,10)
  val doubledNumbers = for (n <- nums) yield n * 2
  println(doubledNumbers)
  // doubledNumbers.foreach(println)

  val names = List ("_andre", "_joao", "_maria")
  val capNames = for (n <- names) yield {
    val namesWithoutUnderscore = n.drop(1)
    val namesCapitalized = namesWithoutUnderscore.capitalize
    namesCapitalized
  }
  println(capNames)
  // Or i could write:
  val namesNew = for (n <- names) yield n.drop(1).capitalize
  println(namesNew)
  def gettingCommand(cmd: String) = cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }
  gettingCommand("exit")
  val count = 3
  count match {
    case 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println("two's company, three's a crowd")
    case x if (x > 3) => println("4+, that's a party")
    case _ => println("i'm guessing your number is zero or less")
  }


}
