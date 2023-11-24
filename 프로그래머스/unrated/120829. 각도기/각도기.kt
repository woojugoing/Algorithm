class Solution {
    fun solution(angle: Int): Int = when(angle % 90 == 0) {
        true -> if(angle == 90) 2 else 4
        false -> if(angle < 90) 1 else 3
    }
}