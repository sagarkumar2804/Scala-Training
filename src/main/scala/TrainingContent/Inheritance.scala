package TrainingContent

object Inheritance {

  /**
   * Tester ''inherits'' the members from Employee class.
   *
   * Access modifiers -
   * - Private - no one can access
   * - Protected - child class can access, but not the object
   * - Public - anyone can access
   *
   * - final -
   * if defined on members (def or val) => cannot be overriden
   * if defined in classes => cannot be extended (inherited)
   */
  class Employee {
    val empId = 101
    def getSalary(): Boolean = true
    def calculateSalary(): Double =
      if (getSalary()) 1000 else 0
  }

  class Person

  // cannot extend more than one class - multiple inheritance is not supported
  class Tester extends Employee {
    override val empId = 102

    /**
     * Method overriding
     *
     * super keyword refers to the immediate parent
     */
    override def calculateSalary(): Double = super.calculateSalary() + 11000

    override def getSalary(): Boolean = false
  }

  def main(args: Array[String]): Unit = {
    println(new Tester().calculateSalary())

    val tester1 = new Tester
    val tester2 = new Tester

    tester1.empId
    tester2.empId
  }

}
