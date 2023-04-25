import scala.io.StdIn.readInt

object FunctionsDemo {
  def main(args: Array[String]): Unit = {
    var result=sum(10,20)
    println(result)
    println("Enter the first number")
    var a = readInt()
    var fin=findFactorial(a)
    print("Factorial of " + a + "!="+fin)
  }
  def sum(a:Int,b:Int):Int={
    var sum=a+b
    return sum
  }
  //def findFactorial(a:Int):Int={
  //var fact=1
  //for (i <- a to 1 by -1) {
  //    fact = fact * i
  //  }
  //return fact
  //}
  /*def findFactorial(a: Int): Int = {
    if (a <= 1) {
      return 1;
    } else {
      return a * findFactorial(a - 1)
    }
  }*/
  def findFactorial(v:Int): Int ={
    if(v<=1) 1 else v * findFactorial(v -1)
  }
}
