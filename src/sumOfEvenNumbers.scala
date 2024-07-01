object sumOfEvenNumbers {
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  // Example usage
  val numbers = List(1, 2, 3, 4, 5, 6)
  val sumEven = sumOfEvenNumbers(numbers)
  println(sumEven) // Output: 12

}
