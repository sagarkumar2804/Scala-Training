package TrainingContent

object AnonFp extends App {

  trait Animal {
    def eat(): Unit
  }

  // Anonymous class
  val dog = new Animal {
    override def eat(): Unit = println("Eating")
  }

  // What compiler does behind the scenes
  class $$anon$ extends Animal {
    override def eat(): Unit = println("Eating")
  }

  val dog_v2 = new $$anon$

  // Function trait
  val sumFxn: Function2[Int, Int, String] =
    new Function2[Int, Int, String] {
      override def apply(v1: Int, v2: Int): String = s"Sum of $v1 and $v2 is ${v1 + v2}"
    }

  val sumFxn_v2: (Int, Int) => String =
    (v1: Int, v2: Int) => s"Sum of $v1 and $v2 is ${v1 + v2}"

}
