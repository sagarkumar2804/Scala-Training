package TrainingPrograms

import scala.annotation.tailrec

object LongestSubSequence extends App{

  // Longest sequence consecutive elements - using tail recursion.
  def longSequence(list: List[Int]):Unit = {
    @tailrec
    def sequenceCounter(list: List[Int],previousCounter:(Int,Int)=(0,0), counter:(Int, Int)=(0,0)):(Int,Int) = {
      list match {
        case Nil =>
          if(counter._2 > previousCounter._2) counter
          else previousCounter
        case h::tail =>
          if (h == counter._1) sequenceCounter(tail,previousCounter,(counter._1,counter._2+1))
          else  {
            if(counter._2 > previousCounter._2) sequenceCounter(tail,counter,(h,1))
            else sequenceCounter(tail,previousCounter,(h,1))
          }
      }
      }
      sequenceCounter(list) match {
      case (0,0) => println("This List provided is an empty one")
      case (_,1) => println("Sorry, There are no sequence consecutive elements present in the list.")
      case (e,c) => println(s"The element $e is repeated consecutively for $c time(s).")
    }
  }

  longSequence(List(2,2,3,5,5,5,5,9,6,7,8,0,3,9,9,9,9,9))
  longSequence(List(1,2,3,4,5))
  longSequence(List())
  longSequence(List(1))
  }



