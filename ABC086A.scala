import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt

  val res = if (a * b % 2 == 1) "Odd" else "Even"
  println(res)
}
