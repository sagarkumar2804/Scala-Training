package TrainingContent

object ApplyExample {

  class Animal {
    def run(): Unit = println("running")
  }

  object Animal {
    def apply(x: Int): Animal = new Animal
  }

  Animal(4)  // Animal.apply()

  case class Employee(id: Int)

/*
  Internally, added by the compiler -
  object Employee {
    def apply(id: Int): Employee = new Employee(id)
  }
*/

  Employee(45)

}
