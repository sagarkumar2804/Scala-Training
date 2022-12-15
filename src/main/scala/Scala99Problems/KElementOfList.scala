package Scala99Problems

import scala.annotation.tailrec

object KElementOfList extends App{

  // Using Tail Recursion
  def getKElement[A](list:List[A],k:Int): Option[A] = {
    @tailrec def inner(list: List[A],acc:Option[A],k:Int):Option[A] = {
      (k,list) match {
        case (_,Nil) => acc
        case (0,_) => acc
        case (1,_) => Some(list.head)
        case _ => inner(list.tail,acc,k-1)
      }
    }
    inner(list,None:Option[A],k)
  }

  println(getKElement(List(2,8,9,7,0),9)) // None - since the element doesn't exist.
  println(getKElement(List.empty,2)) // None - since list is empty
  println(getKElement(List(2,6,5,4,2),1)) // Some(2)

  // Using HOF
  val k = 3
  println(List(9,7,6,5).foldLeft(None:Option[Int],k){ case ((result,counter),ele) =>
    if (counter == 1) (Some(ele), counter - 1)
    else (result, counter - 1)
  }._1) // Some(6)

}
