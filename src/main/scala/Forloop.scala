object Forloop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }
    for (j <- 5 until 20) {
      println(j)
    }
    for (h <- 1 to 10 if h % 2 == 0) {
      println(h)
    }
    println("==========")
    for (i <- 1 to 100 by 2) {
      println(i)
    }
    for (i <- 1 to 100 by -2) {
      println(i)
    }
    for (h <- 1 to 100 by -2 if h % 2 == 0) {
      println(h)

    }

  }
}
