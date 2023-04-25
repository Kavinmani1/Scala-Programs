import scala.io.StdIn.readInt

object Normalmultiplication {
  def main(args: Array[String]): Unit = {
    println("what multiplication table do you want")
    var c = readInt()
    println("Enter the first number")
    var a = readInt()
    println("Enter the second number")
    var b = readInt()
    for (i <- a to b  if (i != 5)) {
      println(i + " * " + c + " = " + i * c)
    }
  }
}
