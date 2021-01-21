package com.andrefms

object book06 extends App {
  // Traits
  trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit = println("test")
  }
  trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit
  }
  class Dog extends TailWagger with Runner {
    def startTail() = println("tail is wagging")
    override def stopTail() = println("tail is stopped")  // Override is used if the method is not abstract

    // Runner
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
  }
  var animal1 = new Dog()
  animal1.startTail()
  animal1.startRunning()
}
