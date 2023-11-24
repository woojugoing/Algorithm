class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        for (i in strArr.indices) {
            strArr[i] = when (i % 2 == 0) {
                true -> strArr[i].toLowerCase()
                false -> strArr[i].toUpperCase()
            }
        }

        return strArr
    }
}
