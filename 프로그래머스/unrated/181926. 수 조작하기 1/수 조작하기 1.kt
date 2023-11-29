class Solution {
    fun solution(n: Int, control: String): Int {
        var num = n
        for(i in control.indices){
            when(control[i]) {
                'w' -> num += 1
                's' -> num -= 1
                'd' -> num += 10
                'a' -> num -= 10
            }
        }
        return num
    }
}