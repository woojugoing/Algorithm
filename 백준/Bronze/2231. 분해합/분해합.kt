import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = n.toString().length
    var answer = 0

    for (i in n - (l * 9) until n) {
        var sum = 0
        for (digitChar in i.toString()) {
            if (digitChar.isDigit()) {
                sum += digitChar.toString().toInt()
            }
        }
        if (i + sum == n) {
            answer = i
            break
        }
    }

    println(answer)
}