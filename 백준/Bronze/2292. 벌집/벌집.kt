import java.io.InputStreamReader
import java.io.BufferedReader

fun main() {
    val n = BufferedReader(InputStreamReader(System.`in`))
    val N = n.readLine().toInt()
    var S = 1

    if(N != 1) {
        while (true) {
            val term = 3 * S * S - 3 * S + 1
            if (term >= N) break
            S++
        }
    }

    println(S)
}

// 1, 7, 19, 37, 61의 일반항
// 수열의 차가 등차수열인 계차수열이므로,
// an = a1 + ∑_{k=1}^{n-1}(6k)
//    = 1 + 2 * n * (n - 1) / 6
//    = 3n^2 - 3n + 1