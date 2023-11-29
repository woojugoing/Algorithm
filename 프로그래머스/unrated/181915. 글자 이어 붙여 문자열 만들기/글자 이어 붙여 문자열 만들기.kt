class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer = ""
        for(i in index_list.indices) {
            answer += my_string[index_list[i]]
        }
        
        return answer
    }
}