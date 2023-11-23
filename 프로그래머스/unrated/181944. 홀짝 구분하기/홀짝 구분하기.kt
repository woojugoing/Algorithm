fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    when(a % 2 == 0) {
        true -> print("$a is even")
        false -> print("$a is odd")
    }
}