object Purefunction {
  var k=10

  def main(args: Array[String]): Unit = {
    println(sum(10,40))
  }
  def sum(i:Int,j:Int):Int={
    i+j
  }
  def sum1(i:Int,j:Int):Int={
    i+j*k
  }

}
