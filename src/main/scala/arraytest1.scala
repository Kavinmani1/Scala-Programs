object arraytest1 {
  def main(args: Array[String]): Unit = {
    var v=Array(1,2,3,4,5,6,7,8,9,10)
    v.foreach(printthis)

  }
  def printthis(arr:Int):Unit={
    if (arr == 5)
      println("Five")
      else println(arr)
  }

}
