class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val m = my_string
        val i = is_suffix
        
        if(m[m.lastIndex] == i[i.lastIndex] && m.contains(i)) return 1 
        else return 0
    }
}