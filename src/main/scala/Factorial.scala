import scala.io.StdIn.readInt

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    var a = readInt()
    var fact = 1
    for (i <- a to 1 by -1) {
      fact = fact * i
      print("Factorial of " + a + "!=" + i+"*"+fact)

    }
  }
}
