package TrainingContent

object FP_v2 extends App {

  // PARTIALLY APPLIED FUNCTION
  def productWithOffset(offset: Int, x: Int, y: Double): Double = offset + x * y
  val product: (Int, Double) => Double = productWithOffset(100, _, _)
  product(5, 10)

  // CURRYING FUNCTION - chain of functions or grouping the parameters such that they are applied one after the other
  def productWithOffsetCurried(offset: Int)(x: Int, y: Double): Double = offset + x * y
  val withOffsetOnly: (Int, Double) => Double = productWithOffsetCurried(100)
  val withProductTerms: Double = withOffsetOnly(10, 5.0)

}
