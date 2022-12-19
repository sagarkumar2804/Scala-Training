package TrainingPrograms

import scala.annotation.tailrec

object BinarySearch extends App{

  //Binary Search Algorithm - Using Tail Recursion.
  def binarySearch(list: List[Int],ele:Int):Option[Int] = {
    @tailrec
    def search(li:List[Int]):Option[Int] = {
      li match {
        case Nil => None
        case h::Nil => if(h == ele) Some(h) else None
        case _ =>
          val length = li.length
          val mid = li(length/2)
//          println(s"list: $li")
//          println(s"length $length")
//          println(s"mid element $mid") // uncomment these lines to see each iteration values.
          if (ele == mid) Some(ele)
          else if (ele < mid) search(li.slice(0,length/2))
          else search(li.slice(length/2,length-1))
      }
    }
    search(list)
  }

  val res = binarySearch(List(2,4,5,7,7,8),6)
  res match {
    case None => println("Sorry, The element is not present in the list.")
    case Some(v) => println(s"The element $v is present in the list.")
  }
}
