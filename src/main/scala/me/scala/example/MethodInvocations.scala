package me.scala.example

/**
  * @author Byungwook lee on 2018. 8. 15.
  *         quddnr153@gmail.com
  *         https://github.com/quddnr153
  */
object MethodInvocations {
  def main(args: Array[String]): Unit = {
    /* arity-0 */
    arity0()
    arity0

    /* infix notation */
    val a = 10
    val b = 20
    // Recommended
    println(a + b)
    // legal, but less readable
    println(a+b)
    // legal, but definitely strange
    println(a.+(b))

    // But avoid it for almost all alphabetic-named methods
    val names = List("quddnr", "ekthf", "rkdals", "ehdrb")
    // recommended
    println(names.mkString(","))
    // also sometimes seen; controversial
    println(names mkString ",")

    // If commutative (교환법칙) method, recommend using infix notation
    // fairly common
    println(a max b)

    /* postfix notation */
    // recommended
    println(names.length)
    // discourage
    println(names length)

    /* prefix notation */
    println(~3)
    println(3.unary_~)
    println(-3)
    println(3.unary_-)
  }

  def arity0(): Unit = println("This is arity-0 invocation")
}
