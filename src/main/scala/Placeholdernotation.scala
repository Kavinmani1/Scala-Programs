object Placeholdernotation {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=20
    val v1=testM(_+_,a,b,30.0)
    println(s"===>$v1")

  }
  def testM(function: (Int, Int) => Int, a: Int, b: Int, d: Double):Double ={
    function(a,b)*d
  }

}
