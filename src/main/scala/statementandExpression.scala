object statementandExpression {
  def main(args: Array[String]): Unit = {
    var x1:Int=10 //statement
    var k={ //expression
      val a=10
      val b=10
      val c=10
      val d=10
      a*b*c*d
    }
    println("_________________")
    println(k)
    println("_______________________")
  }

}
