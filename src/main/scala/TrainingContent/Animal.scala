package TrainingContent

class Animal {

  def eat(food: String): Unit = println(s"Eating: $food, walking with ${Animal.numberOfLegs} legs")

}

// COMPANION OBJECT
object Animal {

  // static members - class-level members
  val numberOfLegs = 4
}
