class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int = when(flag) {
        true -> a + b
        false -> a - b
    }
}