object Testarray {
  def main(args: Array[String]): Unit = {
    //val arr = Array.ofDim[Int](n1 = 2, n2 = 2)
    var n: Int = 3
    val myArr2 = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 6),Array(1,3,5,6),Array(6,7,4,7))
    //arr(0)(0)=10
    //arr(0)(1)=20
    //println(arr(0)(0))
    //for (i<-0 to n;j<-0 until n){
    // print(i,j)//accessing the elements
    //println("="+arr(i)(j))
    //println("="+myArr2(i)(j))
    //}
    for (i <- 0 to 3) {
      for (j <- 0 to n) {

        //accessing the elements
        //println("="+arr(i)(j))
        print(myArr2(i)(j))
        if (j != n)
          print(",")
      }
      println()
    }
  }
}
