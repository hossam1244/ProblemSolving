package array

fun main() {

    var array = intArrayOf(1, 4, 2, 5, 3)
    sumOddLengthSubarrays(array)
}

fun sumOddLengthSubarrays(arr: IntArray) {
    var result = 0
    val size = arr.size - 1
    for (i in 0..size) {
        var arraySum = 0
        for (j in i..size) {
            arraySum += arr[j]
            val isArrayLengthOdd = (j - i + 1) % 2 == 1
            if (isArrayLengthOdd) result += arraySum
        }
    }
     print(result)
}
