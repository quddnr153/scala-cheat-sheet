package me.scala.example

/**
  * @author Byungwook lee on 2018. 8. 15.
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object CollectionsExample {
  def main(args: Array[String]): Unit = {
    val numbers = (1 to 100).toList

    println("map")
    println(numbers.map(_ * 2).mkString(","))

    println("filter")
    println(numbers.filter(_ > 5).mkString(","))

    println("map and filter")
    println(numbers.map(_ * 2).filter(_ < 10).mkString(","))

    case class User(name: String, age: Int)

    val users = List(User("quddnr", 29), User("wjdgus", 40), User("adults2", 20), User("teenager1", 10), User("teenager2", 10))

    val (teenagers, adults) = users partition (_.age < 20)

    println("teenagers = " + teenagers)
    println("adults = " + adults)

    println(users.map(_.age).sum)
    println(users.map(_.age).max)
    println(users.map(_.age).min)
  }
}
