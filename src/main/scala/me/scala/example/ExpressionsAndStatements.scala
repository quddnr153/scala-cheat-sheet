package me.scala.example

import scala.collection.mutable

/**
  * @author Byungwook lee on 2018. 8. 15.
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object ExpressionsAndStatements {
  def main(args: Array[String]): Unit = {
    val something = true

    // Statements : Java 처럼 사용하는 Scala
    val result1 = validateSomething(true)
    println(result1)

    // Expressions : scala 에서 if else, for 등은 expression 이다
    def validateSomethingWithExpressions(something: Boolean) = if (something) "validated" else "invalidated"

    val result2 = validateSomethingWithExpressions(something)
    println(result2)

    case class User(name: String, age: Int)

    val users = List(User("Byungwook Lee", 29), User("Test1", 33), User("Bruce Banner", 44), User("Spider man", 23))

    // Java 처럼 사용하는 for statements
    var temp = mutable.ArrayBuffer.empty[String]

    for (user <- users) {
      if (user.age >= 20 && user.age < 30) {
        temp += user.name
      }
    }

    println(s"$temp")

    // for expressions
    val twentyNames = for (user <- users if user.age >= 20 && user.age < 30) yield user.name

    twentyNames.foreach(println)
    println(s"$twentyNames")
  }

  def validateSomething(something: Boolean): String = {
    if (something)
      return "validated"
    else
      return "invalidated"
  }
}
