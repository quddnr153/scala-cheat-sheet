package me.scala.example

/**
  * @author Byungwook Lee on 2018-03-11
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object Classes extends App {
  val point = new Point(10, 20)

  println("toString : " + point)
  println("sumOfXY : " + point.sumOfXY)
  println("x : " + point.numberX)
  println("y : " + point.numberY)

  // Throw IllegalArgumentException cuz y is not positive
  val point2 = new Point(10, -10)
}

class Point(x: Int, y: Int) {
  require(y > 0, "Y must be positive")

  def this(x: Int) = {
    this(x, 10)
  }

  def numberX = x // public method computed every time it is called
  def numberY = y

  private def doSomething(a: Int): Int = a

  val sumOfXY = x + y

  override def toString: String = x + ", " + y
}