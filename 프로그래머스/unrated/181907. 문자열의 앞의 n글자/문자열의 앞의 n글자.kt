class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = ""
        for(i in 0 until n) {
            answer += my_string[i]
        }
        
        return answer
    }
}