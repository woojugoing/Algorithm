class Solution {
    fun solution(a: Int, b: Int): Int = if(2 * a * b > "$a$b".toInt()) 2 * a * b else "$a$b".toInt()
}