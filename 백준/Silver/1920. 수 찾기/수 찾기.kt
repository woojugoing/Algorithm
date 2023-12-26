import java.lang.StringBuilder
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr1 = ArrayList<Int>()
    for(i in 0 until n) arr1.add(sc.nextInt())

    val m = sc.nextInt()
    val arr2 = ArrayList<Int>()
    for(i in 0 until m) arr2.add(sc.nextInt())

    arr1.sort()
    val result = StringBuilder()

    arr2.forEach { key ->
        when(binarySearch(arr1, key)) {
            true -> result.append("1\n")
            false -> result.append("0\n")
        }
    }

    print(result)

}

fun binarySearch(arr: ArrayList<Int>, key: Int): Boolean {
    var min = 0
    var max = arr.size - 1

    while(min <= max) {
        val mid = ( min + max ) / 2
        when {
            arr[mid] == key -> return true
            arr[mid] >  key -> max = mid - 1
            arr[mid] <  key -> min = mid + 1
        }
    }

    return false
}