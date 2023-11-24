import kotlin.math.*

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val a = numer1 * denom2 + numer2 * denom1
        val b = denom1 * denom2
        val g = gcd(a, b)
        return intArrayOf(a / g, b / g)
    }
}

fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a