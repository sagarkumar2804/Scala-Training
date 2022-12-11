package Scala99Problems

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object LastEle extends App{

  // Using BuiltIn Functions.
    val last: List[Int] => Option[Int] = (lis: List[Int]) => lis.lastOption

  // Using Tail Recursion with if,else conditions.
    val last_rec:List[Int] => Option[Int] = (x:List[Int]) => {
      @tailrec
      def inner(list:List[Int],acc:Option[Int] ):Option[Int] = {
        if (list.isEmpty) acc
        else inner(list.tail, list.headOption)
      }
      inner(x,None)
    }

// Using Tail Recursion with pattern matching
  def last_ele(l:List[Int]):Option[Int] = {
    @tailrec def inner(list:List[Int],acc:Option[Int]):Option[Int] = {
      list.headOption match {
        case None => acc
        case Some(head) => inner(list.tail,Some(head))
      }
    }
    inner(l,None)
  }

  println(last_ele(List(1,2,5,0,8907)))

  // Using High order functions : Gives -1 for empty List.
  println(List(4,9,7).foldLeft(-1){(acc,ele) => ele})

// Using generics to accept any type of List.
  def get_Last[A](l:List[A]):Option[A] = {
    @tailrec def inner(list:List[A],acc:Option[A]):Option[A] = {
      list.headOption match {
        case None => acc
        case Some(head) => inner(list.tail,Some(head))
      }
    }
    inner(l,None)
  }

  println(get_Last(List(1,2,3,4,5)))
  println(get_Last(List("AD","BC","GTY","HY")))
  println(get_Last(List('A','d','b','c')))
  println(get_Last(List(1.2,3.8,5.7,89.987)))
}
