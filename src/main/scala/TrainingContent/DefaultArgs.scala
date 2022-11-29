package TrainingContent

object DefaultArgs {

  class Employee(empId: Int = -1, name: String, deptId: Int = 0)

  val emp1 = new Employee(name = "Tester", empId = 101) // Named arguments

}
