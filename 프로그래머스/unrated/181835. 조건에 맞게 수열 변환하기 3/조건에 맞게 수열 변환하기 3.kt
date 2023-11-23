class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        for(i in arr.indices) {
            if(k % 2 == 0) arr[i] += k
            else arr[i] *= k
        }
        return arr
    }
}