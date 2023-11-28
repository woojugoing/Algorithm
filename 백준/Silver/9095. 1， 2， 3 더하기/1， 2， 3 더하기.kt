import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val n = Array(t) { sc.nextInt() }

    val dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4 until 11) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]

    n.forEach {
        println(dp[it])
    }
}