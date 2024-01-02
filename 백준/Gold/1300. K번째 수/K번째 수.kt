import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()

    var min = 1L
    var max = n.toLong() * n.toLong()
    var answer = 0L
    var mid = 0L

    while(min <= max) {
        mid = ( min + max ) / 2
        val count = fun1300(mid, n)

        when(count >= k) {
            true -> {
                answer = mid
                max = mid - 1
            }
            else -> min = mid + 1
        }
    }
    println(answer)
}

fun fun1300(mid: Long, n: Int): Long {
    var count = 0L
    for(i in 1..n) {
        count += minOf(mid / i, n.toLong())
    }

    return count
}

