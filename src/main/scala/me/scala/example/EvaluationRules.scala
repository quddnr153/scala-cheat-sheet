package me.scala.example

/**
  * @author Byungwook Lee on 2018-03-11
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object EvaluationRules extends App {
  def example1 = 2 // evaluated when called
  val example2 = 2 // evaluated immediately
  lazy val example3 = 2 // evaluated once when needed

  println(example3) // 디버그 찍어보면, example 3 은 불리기 전까지 0으로 기본값, 불리게 되면 2로 evaluate
  println(example1)
  println(example2)

  // Call by value
  def square1(x: Double): Double = {
    x * x
  }

  println(square1(10.0))

  // Call by name
  def square2(x: => Double): Double = {
    x * x
  }

  println(square2(10.0))

  println("Evaluation Rules")
}
