import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()    // k = 4
    val n = sc.nextInt()    // n = 11

    val cable = mutableListOf<Long>()
    for(i in 0 until k) cable.add(sc.nextLong())     // 802, 743, 457, 539
    cable.sort()                                          // 457, 539, 743, 802

    var max = cable[k - 1]      // max = 802 -> 400.5               -> 300.125  -> ...
    var mid = 0L                // mid = 0
    var min = 1L                // min = 1              -> 201.75               -> ...

    while(max >= min) {
        var count = 0L
        mid = ( max + min ) / 2     // mid = 803 / 2 = 401.5 -> 200.75 -> 301.125 -> 250.9375 -> ...

        for(i in cable.indices) count += cable[i] / mid     // count =  약 6.32 -> 12.65 -> 8.43 -> ...
        
        when(count >= n) {
            true -> min = mid + 1
            else -> max = mid - 1
        }
    }

    println(max)
}