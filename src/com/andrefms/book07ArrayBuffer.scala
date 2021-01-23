package com.andrefms
import scala.collection.mutable.ArrayBuffer

object book07ArrayBuffer extends App {
  // ArrayBuffer
  //  It’s a mutable sequence, so you can use its methods to modify its contents
  // Have to import it
  val nums = ArrayBuffer[Int]()
  // Here are a few ways you can add more elements to this
  // add one element
  nums += 4
  // add multiple elements
  nums += 5 += 6
  // add multiple elements from another collection
  nums ++= List(7, 8, 9)

  val a = ArrayBuffer(1, 2, 3)         // ArrayBuffer(1, 2, 3)
  a.append(4)                          // ArrayBuffer(1, 2, 3, 4)
  a.append(5, 6)                       // ArrayBuffer(1, 2, 3, 4, 5, 6)
  a.appendAll(Seq(7,8))                // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)
  a.clear                              // ArrayBuffer()

  val ab = ArrayBuffer(9, 10)           // ArrayBuffer(9, 10)
  ab.insert(0, 8)                       // ArrayBuffer(8, 9, 10)
  ab.insertAll(0, Vector(4, 5, 6, 7))   // ArrayBuffer(4, 5, 6, 7, 8, 9, 10)
  ab.prepend(3)                         // ArrayBuffer(3, 4, 5, 6, 7, 8, 9, 10)
  ab.prepend(1, 2)                      // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  ab.prependAll(Array(0))               // ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val ac = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  ac.remove(0)                          // ArrayBuffer(b, c, d, e, f, g)
  ac.remove(2, 3)                       // ArrayBuffer(b, c, g)

  val ad= ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
  ad.trimStart(2)                       // ArrayBuffer(c, d, e, f, g)
  ad.trimEnd(2)                         // ArrayBuffer(c, d, e)
}
