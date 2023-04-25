object Stringcompare {
  def main(args: Array[String]): Unit = {
    val a ="hello"
    val b ="hello"
    if(a==b) {
      println("a is equal to b")
    }else {
      println("a is not equal")
    }
    if(a eq b) {
      println("a is equal to b")
    } else{
      println("a is not equal")
    }
    val k="kite"
    val l="kite"
    if (k==l) {
      println("k is equal to l")
    }else{
      println("k is not equal to l")
    }
    if (k eq l) {
      println("k is equal to l")
    }else{
      println("k is not equal to l")
    }
    if (k.toUpperCase()==l.toUpperCase()){
      println("k and l are equal")
    }
    if (k.toLowerCase() == l.toLowerCase()) {
      println("k and l are equal")
    }
    if (k.toUpperCase() eq l.toUpperCase()) {
      println("k and l are equal")
    }
    if(k.equalsIgnoreCase(l)){
    println("k and l are equal")}
  }

}
