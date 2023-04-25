import scala.io.StdIn.readInt

object Calculator {
  def main(args: Array[String]): Unit = {1
    while (true) {
      println("Enter the first number")
      var a = readInt()
      println("Enter the second number")
      var b = readInt()
      println("please enter the operation")
      var ip: Int = readInt()
      ip match {
        case 1 => println("adding two num =" + (a + b))
        case 2 => println("subtracting two num =" + (a - b))
        case 3 => println("deviding two num =" + a / b)
        case _ => println("multiply two num =" + a * b)
      }
    }
  }
}


