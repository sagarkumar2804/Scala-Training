package TrainingPrograms

import scala.annotation.tailrec

object RecursionPrograms extends App{

  /**
   * Factorial of a number using recursion.
   */
  def fact(x:BigInt):BigInt = {
    if (x <= 0)  1
    else x * fact(x-1)
  }

  println(fact(40))
  //println(fact(6000)) -- Stack Overflow Exception

  /**
   * Factorial of a number using Tail Recursion.
   */
  @tailrec
  def fact_v2(x:BigInt, acc:BigInt): BigInt = {
    if (x<=0) acc
    else fact_v2(x-1,acc*x)
  }

  println(fact_v2(6000,1)) // No Stack Overflow Exception is thrown.

  /**
   * Fibonacci Series Using Tail Recursion.
   */
    def fibonacci_series(num:Int):Unit = {
      val a:Int = 0
      val b:Int = 1
      print(s"$a,$b,")
      @tailrec
      def series_generator(a:Int,b:Int, n:Int): Unit = {
          if (n>0) {
            print(s"${a + b},")
            series_generator(b, a + b, n - 1)
          }
      }
      series_generator(a,b,num-2)
    }

    fibonacci_series(8)

  /**
   * Prime Number Using Tail Recursion.
   */
    def prime_number(num:Int):String = {
      if (num <=1) "Not a Prime Number"
      else if(num ==2 ) "Prime Number"
      else {
        @tailrec
        def check_prime(div:Int=2,isPrime:Boolean = true, loopTill:Int,num:Int): String = {
          if(!isPrime) "Not a Prime Number"
          else if(div > loopTill && isPrime) "Prime Number"
          else if ( num%div == 0 ) check_prime(div,isPrime=false,loopTill, num)
          else check_prime(div+1,isPrime,loopTill,num)
        }
        check_prime(loopTill = num/2,num = num)
      }
    }

    println(prime_number(17))
    println(prime_number(4))

}
