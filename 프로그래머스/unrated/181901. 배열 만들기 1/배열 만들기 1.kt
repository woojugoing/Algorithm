class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(i in 1 .. n) {
            if(i % k == 0) answer += i
        }
        
        return answer.toIntArray()
    }
}