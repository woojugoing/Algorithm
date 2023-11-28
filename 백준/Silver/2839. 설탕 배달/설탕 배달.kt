fun main() {
    var n = readlnOrNull()?.toInt()!!
    var answer = 0

    while(true) {
        if(n % 5 == 0) {
            when(n == 0) {
                true -> print(answer)
                false -> print(answer + n / 5)
            }
            break
        } else if(n < 0) {
            print(-1)
            break
        }
        n -= 3
        answer++
    }
}