object TupleExample {
  def main(args: Array[String]): Unit = {
    var mytuple=(1,2,0,3l,4.3,"test")
    var mytuple2= new Tuple5(1,2.0,3l,4.3,"test")
    var mytuple3= new Tuple6(1,2.0,3l,4.3,"test",(2,3))
    var mytuple6= Tuple6(1,2.0,3,4.3,"test",(2,3))

    println(mytuple._1)
    println(mytuple3._6._1)

    mytuple2.productIterator.foreach((x)=>{
      println(x)
    })
    mytuple2.productIterator.foreach((x)=>println(x))
    mytuple2.productIterator.foreach(println(_))
    var mytuple4 = ("a" -> "b" )
    println(mytuple4)
    var (z,i)=mytuple4
    println(z)
    println(i)
  }

}
