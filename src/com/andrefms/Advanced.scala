package com.rockthejvm

import scala.collection.View.Filter
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

object Advanced extends App {

  // lazy evaluation
  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("I am so very lazy")
    43
  }
  val eagerValue = lazyValueWithSideEffect + 1
  // useful in infinite collections

  // "pseudo-collections": Option, Try
  def methodWithCanReturnNulL (): String = "Hello, Scala"
  val anOption = Option(methodWithCanReturnNulL()) // Some("Hello, Scala")
  // Option = "collection" with contains at most one element: Some(Value) or None

  val stringProcessing = anOption match {
    case Some(string) => s"i have obtained a valid string: $string"
    case None => "I have obtained nothing"
  }
  // map, flatmap, filter can be used too
  println(stringProcessing)

  def methodWhichCanThrowException ():String = throw new RuntimeException
  val aTry = Try(methodWhichCanThrowException())
  // a try = "collection" with either a value if the code went well, or an exception if the code throw one
  val anotherStringProcessing = aTry match {
    case Success(validValue) => s"I have obtained a valid string: $validValue"
    case Failure(ex) => s"I have obtained an exception $ex"
  }


  /**
   * Evaluate something on another thread
   * (asynchronous programming)
   */
  val aFuture = Future{
    println("loading...")
    Thread.sleep(2000)
    println("I have computed value")
    67
  }
  Thread.sleep(2000)
  // Future is a "collection" which contains a value when it's evaluated
  // future is composable with map, flatmap and filter
  // monads

  /**
   * Implicits basics
   */
  // #1: Implicit arguments
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1
  implicit val myImplicitInt:Int = 46
  println(aMethodWithImplicitArgs)  // aMethodWithImplicitArgs(myImplicitInt)

  // #2: Implicit conversions
  implicit class MyRichInteger(n: Int) {
    def isEven() = n % 2 == 0
  }

  println(23.isEven()) // new MyRichInteger(23).isEven()
  // use this carefully

}
