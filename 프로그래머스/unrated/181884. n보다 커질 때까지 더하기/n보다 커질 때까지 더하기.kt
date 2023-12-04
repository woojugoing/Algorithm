class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var result = 0
        for(i in numbers.indices) {
            when(result <= n) {
                true -> result += numbers[i]
                false -> break
            }
        }
        return result
    }
}