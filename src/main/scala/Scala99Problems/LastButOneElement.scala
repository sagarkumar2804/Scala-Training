package Scala99Problems

import scala.annotation.tailrec

object LastButOneElement extends App{

  /**
   *  Find the last but one element of a list.
   */
    // Using tail recursion
  def getLastButOne[A](l:List[A]):Option[A] = {
      @tailrec
      def inner(list:List[A]):Option[A] = {
        list match {
          case Nil => Option.empty[A]
          case _::Nil => Option.empty[A]
          case head::_::Nil => Some(head)
          case _  => inner(list.tail)
        }
      }
      inner(l)
    }

  println(getLastButOne(List())) // None - since list is empty
  println(getLastButOne(List(1))) // None - since list has one element
  println(getLastButOne(List(1,9,7,6))) // Some(7)
  println(getLastButOne(List("ad","bc","fr","gh"))) // Some("fr")

  // Using HOF :
//  val list = List(2,5,6)
//
//  println(list.foldLeft(None:Option[Any],list)((acc,_) => {
//    acc._2  match {
//      case Nil => acc
//      case _::Nil => acc
//      case head::_::Nil => (Some(head),acc._2)
//      case _ =>(acc._1,acc._2.tail)
//    }
//  })._1)

}


/*

 */