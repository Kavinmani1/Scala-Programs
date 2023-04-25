object ArrayExample {
  def main(args: Array[String]): Unit = {
    var myar:Array[String] =new Array[String](3)// to create
    myar(0)="HELLO"//to add
    myar(1)="hai"
    myar(2)="Hai"

    println(myar(1))

    for(i<-myar){
      println(i)
    }
    var myarr2=Array(1,2,3,3)
    println(myarr2(1))
  }
}
