package me.scala.example

/**
  * @author Byungwook Lee on 2018-03-11
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object Curring extends App {
  def multiplyBasic(a: Int, b: Int): Int = {
    a * b
  }

  println("Basic Multiply = " + multiplyBasic(10, 20))

  def multiplyCurring(a: Int)(b: Int): Int = a * b

  println("Curring 1 = " + multiplyCurring(10)(20))

  def multiplyWithTen = multiplyCurring(10)(_)

  println("Curring 2 = " + multiplyWithTen(20))
}
