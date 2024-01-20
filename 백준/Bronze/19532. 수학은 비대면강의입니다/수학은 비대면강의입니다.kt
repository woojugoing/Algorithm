import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()

    val x = (c * e - b * f) / (a * e - b * d)
    val y = (c * d - a * f) / (b * d - a * e)

    print("$x $y")
}