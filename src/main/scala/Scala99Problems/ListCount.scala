package Scala99Problems

import scala.annotation.tailrec

object ListCount extends App {

  //Using tail recursion
  def getCount[A](list: List[A]):Int = {
    @tailrec def inner(currentList: List[A],result:Int):Int = {
      currentList match {
        case Nil => result
        case _::tail => inner(tail,result+1)
      }
    }
    inner(list,0)
  }

  println(getCount(List())) // 0 since empty
  println(getCount(List(2))) // 1
  println(getCount(List(1,2,3))) // 3
  println(getCount(List('a','d','f'))) // 3
  println(getCount(List("ABC","DEF","RTY"))) // 3

  // Using HOF
  val l = List(2,4,6,7,8) // 5
  println(l.foldLeft(0)((acc,_) => acc+1))


}
