class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0.0
        for(i in numbers.indices) {
            sum += numbers[i]
        }
        
        return sum / numbers.size
    }
}