import scala.io.StdIn.readInt

object Evernumber {
  def main(args: Array[String]): Unit = {
    println("Enter the first number")
    var a = readInt()
    println("Enter the second number")
    var b = readInt()
    for (i <- a to b  if i % 2== 0)
      if(i%6!=0)
        {
          println(i)
        }
  }

}
