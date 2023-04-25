import scala.io.StdIn.readInt

object Reversemultiplication {
  def main(args: Array[String]): Unit = {
    println("what multiplication table do you want")
    var c = readInt()
    println("Enter the first number")
    var a = readInt()
    println("Enter the second number")
    var b = readInt()
    for (i <- b to a by -1 if(i!=7)) {
      println(i+" * "+c+" = "+i*c)
    }
  }

}
