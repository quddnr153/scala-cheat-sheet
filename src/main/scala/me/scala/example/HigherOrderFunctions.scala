package me.scala.example

/**
  * @author Byungwook Lee on 2018-03-11
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object HigherOrderFunctions extends App {
  // sum() returns a function that takes two integers and returns an integer
  def getSumAfterFunctionTask1(f: Int => Int): (Int, Int) => Int = {
    def sumFunction(a: Int, b: Int): Int = {
      f(a) + f(b)
    }
    sumFunction
  }

  val squareAndSum = getSumAfterFunctionTask1((x: Int) => x * x)

  println(squareAndSum(3, 4))

  // same as above. Its type is (Int => Int) => (Int, Int) => Int
  def getSumAfterFunctionTask2(f: Int => Int)(a: Int, b: Int): Int = {
    f(a) + f(b)
  }

  val absoluteAndSum = getSumAfterFunctionTask2((x: Int) => math.abs(x))(-10, 20)

  println(absoluteAndSum)
}
