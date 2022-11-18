package TrainingPrograms

import scala.util.control.Breaks.{break, breakable}

object BasePrograms {

  /**
   * A function which accepts an integer and returns whether it is even or odd
   */
  def evenOdd(x:Int):String = {
    val res: String = if (x%2 == 0) "even" else "odd"
    res
  }

  /**
   * Factorial of a number using while loop.
   */
    def factorial(number:BigInt):BigInt = {
      var n:BigInt = number
      var fact:BigInt = 1
      if (number == 0 || number ==1) fact
      else {
        while (n > 1) {
          fact *= n
          n -= 1
        }
        fact
      }
    }

  /**
   * Check if given number is prime or not.
   */
    def prime(x:Int):String = {
      val not:String = "neither prime nor composite"
      if (x == 0 || x==1) not
      else {
        var result: String = "a prime"
        breakable {
          for (i <- 2 to x / 2) {
            if (x % i == 0) {
              result = "Not a Prime"
              break()
            }
          }
        }
        result
      }
    }

  /**
   *  Create a calculator which accepts two double values and can do -
   *    (i) Basic - +, *, division
   *    (ii) Delta value and then find the absolute value
   *    (iii) Divide x/y then return the integer part of the division
   *    (iv) Return remainder of x / y
   */
    def cal(x:Double,y:Double): Unit = {
      val sum:Double = x+y
      println(s"The sum of $x and $y is $sum")
      val diff:Double = x-y
      println(s"The Difference of $x and $y is $diff")
      val mul:Double = x*y
      println(s"The product of $x and $y is $mul")
      val div:Double = x/y
      println(s"The Division of $x and $y is $div")
      val delta: Double = (x-y).abs
      println(s"The Absolute value of Delta of $x and $y is $delta")
      val integerPart:Double = (x/y).floor
      println(s"The Integer part of division of $x and $y is $integerPart")
      val reminder:Double = x%y
      println(s"The Remainder of division of $x and $y is $reminder")
    }


  def main(args:Array[String]):Unit = {
    val num: Int = 10
    println(s"The Number $num is: ${evenOdd(num)}")
    val f: Int = 8
    println(s"The Factorial $f is: ${factorial(f)}")
    val p: Int = 2
    println(s"$p is ${prime(p)} number.")
    cal(14,5)
  }

}
