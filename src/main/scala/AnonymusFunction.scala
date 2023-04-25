import scala.io.StdIn.readLine

object AnonymusFunction {
  def main(args: Array[String]): Unit = { //argument and body
    var myvar = (i: String) => {
      i
    }
    var my = (j: String) => {
      j

    }
    {
    val convar = (_: String) + (_: String)
    println(convar("hai", "kavin"))
    }
    {
      val kav = (_: Int) * (_: Int)
      println(kav(20, 10))
    }

    println("enter the first char")
    var a = readLine()
    println("enter the second char")
    var b = readLine()
    println(myvar(a)+ my(b))

    }
  }

