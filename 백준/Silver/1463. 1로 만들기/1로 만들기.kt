import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val dp = IntArray(n + 1)

    for(i in 2..n) {
        dp[i] = dp[i - 1] + 1
        if(i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
        if(i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
    }

    print(dp[n])
}