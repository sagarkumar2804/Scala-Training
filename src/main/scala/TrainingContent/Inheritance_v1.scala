package TrainingContent

object Inheritance_v1 extends App {

  class Employee {
    def getId: Int = 45
  }
  class Tester extends Employee
  class Developer extends Employee

  def calculateSalary(employee: Employee): Double = 1000

  val tester = new Tester()
  val developer = new Developer()

  calculateSalary(tester)
  calculateSalary(developer)
  calculateSalary(new Employee())

  /**
   * Abstract class -
   * 1. Can have both abstract and concrete methods.
   * 2. IS-A relationship.
   * 3. Can extend single abstract class only.
   * 4. Can have constructor parameters.
   * 5. Can NEVER be instantiated.
   */
  abstract class Employee_v2 {
    def getId: Int    // abstract method
    def getCompanyName: String = "Techsophy"
  }

  class Developer_v2 extends Employee_v2 {
    def getId: Int = 1000
  }

  /**
   * Traits -
   * 1. Can have both abstract and concrete methods.
   * 2. HAS-A relationship
   * 3. Can implement any number of traits
   * 4. Doesn't have constructor.
   * 5. Can NEVER be instantiated.
   */
  trait Codeable {
    def writeCode(): String
  }

  trait Walkable

  class Developer_v3 extends Employee_v2 with Codeable with Walkable {
    def getId: Int = 1000
    override def writeCode(): String = "Developer writing code"
  }

  class HR extends Employee_v2 with Walkable {
    def getId: Int = 1001
  }

}
