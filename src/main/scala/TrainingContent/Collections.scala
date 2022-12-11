package TrainingContent

object Collections extends App {

  val array: Array[Int] = Array(1, 2, 3, 4)
  val list: List[Int] = List(1, 2, 3, 4)
  val set: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val map: Map[Int, String] = Map(1 -> "A", 2 -> "B")
  val seq: Seq[Int] = Seq(1, 2, 3, 4)
  val tuple: Tuple4[Int, Double, Int, Int] = (1, 2.5, 3, 4)

  tuple._1
  array(0)

  val employeeTuple = (101, "Ishan", "ishan@gmail.com")
  employeeTuple._3

  case class Employee(id: Int, name: String, email: String)
  val employeeCase = Employee(101, "Ishan", "ishan@gmail.com")
  employeeCase.email

  println(set)

}
