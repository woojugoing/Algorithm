class Solution {
    fun solution(num_list: IntArray): Int {
        var a = ""
        var b = ""
        
        for(i in num_list.indices) {
            if(num_list[i] % 2 == 0) b += num_list[i].toString()
            else a += num_list[i].toString()
        }
        
        return a.toInt() + b.toInt()
    }
}