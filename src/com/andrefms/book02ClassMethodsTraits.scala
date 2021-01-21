package com.andrefms

object book02ClassMethodsTraits extends App {
  // Classes
  class Person(var firstName: String, var lastName: String) {
    def printFullName() = println(s"$firstName $lastName")
  }
  val p = new Person("Julia", "Kern")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()

  // Methods
  """def sum(a: Int, b: Int): Int = a + b
  def concatenate(s1: String, s2: String): String = s1 + s2"""

  // don't need to declare the method's return type
  def sum(a: Int, b: Int) = a + b
  def concatenate(s1: String, s2: String) = s1 + s2

  // TRAITS
  // Traits in Scala are a lot of fun, and they also let you break your code down into small, modular units

  trait Speaker {
    def speak(): String  // has no body, so it’s abstract
  }

  trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
  }

  trait Runner {
    def startRunning(): Unit = println("I’m running")
    def stopRunning(): Unit = println("Stopped running")
  }
  class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
  }
  val doguinho = new Dog("kevin")
  doguinho.startRunning()
  doguinho.stopRunning()
  class Cat extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I don’t run")
    override def stopRunning(): Unit = println("No need to stop")
  }

}
