object main {
  def main(args: Array[String]): Unit = {
    val str = "Scala"
    def reverseString(s: String): String = {
      if (s.isEmpty) ""
      else reverseString(s.tail) + s.head
    }
    val reversedStr = reverseString(str)
    println(reversedStr)
  }

  def  LongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)

  }
  val strings = List("book", "pen", "pencil", "laptop", "laboratory", "student")



  val filteredStrings =  LongStrings(strings)
  println(filteredStrings)

  def average(num1: Int, num2: Int): Double = {
    val avg = (num1 + num2) / 2.0
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }


  val num1 = 10
  val num2 = 20
  val avg = average(num1, num2)
  println(avg)

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }


  val numbers = List(1, 2, 3, 4, 5, 6)
  val sumEven = sumOfEvenNumbers(numbers)
  println(sumEven) // Output: 12
}
