object Highsum {
  def sum(a:Int,b:Int,sumoff:(Int)=>Int):Int={
    sumoff(a)+sumoff(b)
  }

  def main(args: Array[String]): Unit = {
    var e=sum(2,3,square)
    println(s"The square of the number is :$e")
    var f = sum(2, 3, (Cube:Int)=>Cube*Cube*Cube)
    println(s"The cube of the number is :$f")

  }
  def square(a:Int):Int={
    (a)*(a)
  }
 // def Cube(a:Int):Int={
   // (a)*(a)*(a)
 // }

}
