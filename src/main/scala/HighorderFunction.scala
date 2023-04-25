object HighorderFunction {
  //it consist of other function as a parameter
  def mycal(a:Int,b:Int,func:(Int,Int)=>Int):Int={
    var x=func(a,b)
     a+b*x
  }

  def main(args: Array[String]): Unit = {
    var c=mycal(10,20,add)
    println(c)
  }
  def add (a:Int,b:Int):Int={
    return (a)+(b)
  }

}
