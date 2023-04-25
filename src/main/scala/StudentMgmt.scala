import scala.io.StdIn.{readInt, readLine}

object StudentMgmt {1
  var students:Array[String]=new Array[String](10)
  var i=0;
    def addstudent():Unit={
      println("Please enter the name")
      var sname=readLine()
      students(i)=sname
      i=i+1
    }
  def liststudent():Unit={
    println("student name")
    println("______")
    for(k<-0 to i-1){
      println(students(k))
    }
  }

  def main(args: Array[String]): Unit = {
    while(true){
      println("please choose your operation")
      println("1. addstudent \t 2.Liststudents")
      var ch =readInt()
      ch match{
        case 1=>addstudent()
        case 2=>liststudent()
        case _=>println("Invalid operation")
      }
    }
  }

}
