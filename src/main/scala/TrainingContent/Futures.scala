package TrainingContent

import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Futures extends App {

  val option = Option(10)
  val future: Future[Int] = Future {
    Thread.sleep(2000)
    20
  }

  val resultFuture = future.map(_ * 2).filter(_ % 2 == 0)

  println(resultFuture)

  //println(Await.result(resultFuture, 5.seconds))
  val promise = Promise[Int]()

  if (true) promise.success(20)
  else promise.failure(new IllegalArgumentException)

  val fullFilledFuture: Future[Int] = promise.future

}
