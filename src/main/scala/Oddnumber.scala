import scala.io.StdIn.readInt

object Oddnumber {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    var a = readInt()
    println("Enter the second number")
    var b = readInt()
    for (i <- a to b if i % 2 != 0)
      if (i % 7 != 0) {
        println(i)
      }
  }

}
