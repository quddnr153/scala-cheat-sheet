package me.scala.example

/**
  * @author Byungwook Lee on 2018-03-11
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object ClassHierarchies extends App {
  val level1 = new Level1

  println(level1.basicMethod(1))

  println(SingletonObject.abstractMethod(2))
}

abstract class TopLevel {
  def abstractMethod(x: Int): Int
  def basicMethod(x: Int): Int = x
}

class Level1 extends TopLevel {
  override def abstractMethod(x: Int): Int = x
  override def basicMethod(x: Int): Int = super.basicMethod(x)
}

object SingletonObject extends TopLevel {
  override def abstractMethod(x: Int): Int = x
}
