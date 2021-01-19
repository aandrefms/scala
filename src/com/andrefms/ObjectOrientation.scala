package com.rockthejvm

object ObjectOrientation extends App{

  // class and instance
  class Animal {
    // define fields
    val age: Int = 0
    // define methods
    def eat()= println("I am eating")
  }
  val anAnimal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal // constructor definition
  val aDog = new Dog("lassie")

  // Constructor arguments aren't fields
  // To do so, we need to put a val before the constructor argument

  // subtype polymorphism
  val aDeclaredAnimal: Animal = new Dog("Machi")
  aDeclaredAnimal.eat() // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal {
    val hasLegs = true // by default public, can restrict by adding "private" or "protected" before val
    def walk(): Unit
  }

  // "interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?! (thought: String): Unit // valid method name
  }

  // Single-class inheritance and multi-trait "mixing"
  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Animal): Unit = println(s"I am eating you, $animal")

    override def ?!(thought: String): Unit = println(s"I was thinking: $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation = object method argument, only available for methods with one argument
  aCroc.?!("What if we can fly")
  aCroc ?! "What if we can fly"

  // operators in scala are actually methods
  val basicMath = 1 + 2
  val anotherBasicMath = 1.+(2) // equivalent

  // anonymous classes
  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit = println("I am a dinosaur so i can eat pretty much anything")
  }

  // Is the same thing that:
  /*
    What you tell to the compiler:

    class Carnivore_Anonymous_129124 extends Carnivore {
      override def eat(animal: Animal): Unit = println("I am a dinosaur so i can eat pretty much anything")
    }
    val dinosaur = new Carnivore_Anonymous_129124
   */

  // singleton object
  object MySingleton{ // the only instance of the MySingleton type
    val mySpecialValue = 94133
    def mySpectialMethod(): Int = 9123
    def apply(x: Int): Int = x + 1
  }
  MySingleton.mySpectialMethod()
  MySingleton.apply(65)
  MySingleton(65) // equivalent to MySingleton.apply(65), because the compile interprets as a call to apply

  // if i name a object with a name already used by a class or trait, they become companions
  object Animal { // companions - companions object
    // companions can access each other's private fields/methods
    // the Singleton Animal and instances of Animal are different things
    val canLeaveIndefinitely = false
  }
  val animalsCanLiveForever = Animal.canLeaveIndefinitely

  /*
  // case classes = lightweight data structures with some boilerplate
    - sensible equals and hash code
    - serialization
    - companion with apply
    - Pattern matching
   */
  case class Person(name: String, age: Int)

  // may be constructed without the keyword new
  val bob = new Person("Bob", 22) // equivalent to Person.apply("Bob", 22)


  // exceptions
  try {
    // code that can throw
    val x: String = null
    x.length
  } catch {
    case e: Exception => "some faulty error message"
  } finally {
    // execute some code no matter what
  }

  // generics ( it's like a template )
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  // using a generic with a concrete type
  val aList: List[Int] = List(1,2,3)  // List.apply(1,2,3)
  val first = aList.head
  val rest = aList.tail
  val aStringList = List("hello", "by")
  val firstString = aStringList.head
  val restString = aStringList.tail

  // Point #1: In scala, we usually operate with IMMUTABLE values/objects
  // Any modifications to an object must return ANOTHER object
  /*
    Benefits:
      1- works miracles in multithreaded/distributed env
      2- helps making sense of the code ("reasoning about")
      3-
   */
  val reversedList = aList.reverse // returns a NEW list

  // Point #2: Scala is closest to the O.O. ideal
}


