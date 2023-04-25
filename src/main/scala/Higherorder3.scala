import scala.io.StdIn.readInt

object Higherorder3 {
  def mathoperation(name:Int):(Int,Int)=>Unit=
    (a:Int,b:Int)=> {
      name match {
        case 1 => println("adding two num =" + (a + b))
        case 2 => println("subtracting two num =" + (a - b))
        case 3 => println("deviding two num =" + a / b)
        case 4 => println("multiply two num =" + a * b)
      }
    }

  def add: (Int, Int) => Unit = mathoperation(name = 1)

  def sub: (Int, Int) => Unit = mathoperation(name = 2)

  def mul: (Int, Int) => Unit = mathoperation(name = 3)

  def div: (Int, Int) => Unit = mathoperation(name = 4)

  def main(args: Array[String]): Unit = {
    var v = add(10, 5)
  }
}

