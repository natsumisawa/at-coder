object Main extends App {
  val list = scala.io.StdIn.readLine.toList
  val res = list.count(_ == '1')
  println(res)
}