package TrainingContent
  import scala.util.{Success, Try}

  object HOFBuiltIn extends App {

    val list = List(1, 2, 3, 4)

    println(list.map(_ * 10.5))

    println(list.flatMap(v1 => List(v1, v1 + 1)))

    println(list.filter(_ % 2 == 0))

    // List(1, 2, 3, 4)
    // 1 + 2
    println(list.reduce((v1, v2) => v1 + 10 + v2))
    println(list.reduce(_ + 10 + _))

    // List(1, 2, 3, 4)
    // "hello_" + 1
    println(list.foldLeft("hello_")((v1: String, v2: Int) => v1 + v2 + "_"))

    // OPTION
    val optionValue: Try[Int] = Success(5)
    println(optionValue.map(x => x * 10))
    println(optionValue.flatMap(x => Success(x * 10)))
    println(optionValue.filter(x => x % 2 == 0))

    def someFxn(): Double = ???

  }


