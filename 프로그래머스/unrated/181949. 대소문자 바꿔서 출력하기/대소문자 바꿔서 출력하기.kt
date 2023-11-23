fun main(args: Array<String>) {
    val str = readLine()!!
    
    for(i in 0 until str.length) {
        when(Character.isUpperCase(str[i])) {
            true -> print(Character.toLowerCase(str[i]))
            false -> print(Character.toUpperCase(str[i]))
        }
    }
    
    
}