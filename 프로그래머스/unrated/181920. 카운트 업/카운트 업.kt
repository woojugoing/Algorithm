class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer = IntArray(end_num - start_num + 1)
        for(i in start_num .. end_num) {
            answer[i - start_num] = i
        }
        
        return answer
    }
}