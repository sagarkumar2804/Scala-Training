package TrainingContent

  import scala.util.{Failure, Success, Try}

  object PatternMatching extends App {

    val x: Int = 11
    x match {
      case 5 => println("the value is 5")
      case i if i % 2 == 0 => println("even number")
      case _ => println("everything will be accepted")
    }

    val option = Option(10)

    option match {
      case Some(value) => println(s"Got valid value: $value")
      case None => println("No value found")
    }

    val tryCase = Try(1/0)

    tryCase match {
      case Success(value) => println(s"Got valid value: $value")
      case Failure(exception) => println(exception.getMessage)
    }

    val list1 = List(1, 2, 3, 4)
    // :: - append a new element at the head of the list
    // ::: - concatenate two lists
    val list2 = List(5, 6)

    println(10 :: list1)
    println(list1 ::: list2)

    list1 match {
      //case x if x.head == 1 => println("Found 1 at the head position")
      //case 1 :: tail => println(s"Found 1 at the head position and tail is: $tail")
      case _ :: second :: _ if second % 2 == 0 => println("Found even number at the second position")
      //case List() => println("List is empty")
      case Nil => println("List is empty")
    }

    case class Person(id: Int, name: String)

    val person = Person(id = 1, name = "ABC")

    person match {
      case x if x.name == "ABC" => ???
      case Person(id, name) if name == "ABC" =>
    }

  }


