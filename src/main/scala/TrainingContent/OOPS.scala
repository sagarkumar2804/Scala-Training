package TrainingContent

object OOPS {

  class Employee(empId: Int, val deptId: Int, firstName: String) {

    def this(empId: Int, firstName: String) = {   // Constructors never have return types
      this(empId, 0, firstName)
    }

    /**
     * Auxillary constructors - always have to either call another auxillary or primary constructor
     */
    def this(firstName: String) = {
      this(-1, firstName)
      // this(-1, 0, firstName)
    }

    def printDept(): String = s"My dept name is: $deptId"

    override def toString: String =
      s"Employee[empId=$empId, deptId=$deptId]"

  }

  /**
   * Provides in-built method overrides -
   * - toString - constructor parameters details
   * - equals - equality based on the constructor parameters
   * - hashCode
   *
   * - By default, Serializable
   * - We don't have to use ''new'' keyword to instantiate the object
   * - Constructor parameters are by default class members
   */
  case class Employee_v2(empId: Int, deptId: Int, firstName: String)

  /**
   * Limitations of a case class -
   * 1. Code based gets increased significantly.
   * 2. Case class cannot `extend` another case class.
   */

  def main(args: Array[String]): Unit = {
    val emp1 = Employee_v2(101, 11, "Ishan")
    val emp2 = Employee_v2(101, 11, "Ishan")

    /**
     * For normal class -
     */
    emp1.deptId // is a class member
    // emp1.empId // is a constructor parameter, but not a class member, hence not accessible from object

    println(emp1 == emp2)
    println(emp1.deptId)
  }

}
