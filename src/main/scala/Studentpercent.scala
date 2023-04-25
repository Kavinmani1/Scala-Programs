import scala.io.StdIn.{readInt, readLine}

object Studentpercent {
  def main(arg: Array[String]): Unit = {

    var myar: Array[Int] = new Array[Int](5)
    println("Enter the name of the student")
    var name=readLine()
    println("Enter the Marks of the student")
    myar(0) =readInt()
    myar(1) =readInt()
    myar(2) =readInt()
    myar(3) =readInt()
    myar(4) =readInt()
    var sum=0
    for (i <- myar) {
      sum=sum+i
      println(sum)
    }
    var p = (((sum) / 500f) * 100f)
    println(p)

  }
}
