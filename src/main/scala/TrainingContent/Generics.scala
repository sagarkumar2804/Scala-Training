package TrainingContent

import scala.util.{Failure, Success, Try}

object Generics extends App {

  // Space complexity
  class MyList[T] {     // Type-class
    def addElement(elem: T): MyList[T] = ???
  }

  class Employee

  /*  new MyList[Int]().addElement(10)
    new MyList[String]().addElement("hello").addElement("world")
    new MyList[Employee]().addElement(new Employee)*/
  List(1, 2, 3) // add element 4
  val original: List[Int] = List(1, 2, 3) // M1
  val adding: List[Int] = 4 :: original // M(4) + M1
  // NullPointerException - null => Option (potentially empty)
  val employee: Employee = null
  val employee_better: Option[Employee] = None
  val employee_present: Option[Employee] = Some(new Employee)

  //  val x: Employee = employee_better.get // NOT a good practise
  val failedEmployee: Try[Employee] = Failure(new UnsupportedOperationException)
  val successEmployee: Try[Employee] = Success(new Employee)
  // failedEmployee.get // NOT a good practise
  val leftEmployee: Either[String, Employee] = Left("Employee doesn't exist")
  val rightEmployee: Either[String, Employee] = Right(new Employee)

  def divide(x: Int, y: Int): Try[Int] = {
    if (y == 0) Failure(new IllegalArgumentException("Denominator should not be zero"))
    else Success(x / y)
  }

  println(s"Division result is: ${divide(10, 0)}")

}
