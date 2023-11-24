class Solution {
    fun solution(num_list: IntArray): Int {
        var mul = 1
        var sum = 0
        
        for(i in num_list.indices) {
            sum += num_list[i]
            mul *= num_list[i]
        }
        
        sum *= sum
        
        when(mul < sum) {
            true -> return 1
            false -> return 0
        }
    }
}