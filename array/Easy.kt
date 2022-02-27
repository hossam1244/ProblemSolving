package array

import kotlin.math.abs
import kotlin.math.min


val operations = arrayOf("--X", "X++", "X++")
val encoded: IntArray = intArrayOf(1, 2, 3)

val firstNumber = 1


fun main() {
    //finalValueAfterOperations(operations)
//    var sentences =
//        arrayOf("please wait","continue to fight","continue to win")
//    mostWordsFound(sentences)
    //decode(encoded = encoded, firstNumber)
    // countKDifference(countKDifferenceNums, countKDifferenceK)
    //  minMovesToSeat(seats, students)
    //  sumOddLengthSubarray(sumOddArray)
    // targetIndices(targetIndicesArray,target = 2)
    //print(arrayStringsAreEqual(word1, word2))
    // countConsistentStrings(allowed, words)
    //firstPalindrome(palindrome)
    //maxProductDifference(maxProductArray)
    //truncateSentence(truncate,k)
    //flipAndInvertImage(imageDimensionalArray)
    //minTimeToVisitAllPoints(pointsDimensionalArray)
    //largestAltitude(gain = gain)
    // countGoodRectangles(rectangles)
    // diagonalSum(diagonalSumTwoArray)
    // sumOfUnique(uniqueNums)
    // repeatedNTimes(repeatedNums)
    // findGCD(gcdNums)
    plusOne(digits)
}


fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0
    operations.forEach {
        if (it[0] == '+' || it[it.lastIndex] == '+')
            x++
        else
            x--
    }

    return x

}


fun mostWordsFound(sentences: Array<String>): Int {
    var n = sentences.map { it.split(" ").size }.maxOrNull()
    return n!!
}


fun decode(encoded: IntArray, first: Int): IntArray {


    var newArray = IntArray(encoded.size + 1)
    newArray[0] = first

    for (i in encoded.indices) {
        newArray[i + 1] = newArray[i] xor encoded[i]
    }

    return newArray
}


var countKDifferenceNums: IntArray = intArrayOf(1, 2, 2, 1)
val countKDifferenceK = 1

fun countKDifference(nums: IntArray, k: Int): Int {
    print(
        Math.abs(1 - 1)
    )
    // 1 1 2 2
    var count = 0
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] - nums[j] == k)
                count++
        }
    }

    return count

}


val seats: IntArray = intArrayOf(3, 1, 5)
val students: IntArray = intArrayOf(2, 7, 4)
fun minMovesToSeat(seats: IntArray, students: IntArray) {
    var total = 0
    seats.sort()
    students.sort()
    for (i in students.indices) {
        val abs = abs(students[i] - seats[i])
        total = +total + abs
    }

    print(total)
}


val sumOddArray: IntArray = intArrayOf(1, 4, 2, 5, 3)
fun sumOddLengthSubarray(arr: IntArray) {

    var sum = 0

    for (i in 0 until arr.size - 1) {
        var sum = 0
        for (i in arr.indices) {
            var temp_sum = 0
            for (j in i until arr.size) {
                if ((i + j) % 2 == 0) {
                    for (k in i..j) {
                        temp_sum += arr[k]
                    }
                }
            }
            sum = sum + temp_sum
        }
        print(sum)
    }
}


val targetIndicesArray: IntArray = intArrayOf(1, 2, 5, 2, 3)
fun targetIndices(nums: IntArray, target: Int): List<Int> {
    nums.sort()
    var list = mutableListOf<Int>()


    for (i in nums.indices) {
        if (nums[i] == target)
            list.add(i)

        if (nums[i] > target)
            break
    }



    return list
}


var word1 = arrayOf("ab", "c")
var word2 = arrayOf("a", "bc")
fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {

    var first: String = ""
    var second: String = ""


    for (i in word1.indices) {
        first += word1[i]
    }


    for (i in word2.indices) {
        second += word2[i]
    }


    if (first == second)
        return true

    return false


//    val string1 = StringBuilder()
//    val string2 = StringBuilder()
//
//
//
//    word1.map { it.toCharArray().forEach { char -> string1.append(char)} }
//    word2.map { it.toCharArray().forEach { char -> string2.append(char)} }
//
//
//
//
//
//    if (string1.toString() == string2.toString())
//        return true
//
//    return false

}


val allowed = "abc"
val words = arrayOf("a", "b", "c", "ab", "ac", "bc", "abc")
fun countConsistentStrings(allowed: String, words: Array<String>) {

    var i = "a".toSortedSet()


    //  print(i == allowed.toSortedSet())


    var total = 0

    for (word in words.indices) {
        val sortedSetWord = words[word].toSortedSet()
        var exist = true
        for (char in sortedSetWord) {
            if (!allowed.contains(char))
                exist = false
        }
        if (exist)
            total += 1
    }

    print(total)

}


val palindrome = arrayOf("abc", "car", "ada", "racecar", "cool")

fun firstPalindrome(words: Array<String>): String {
    // TODO naive solution
//    var firstPalindrome = ""
//
//
//    for (word in words) {
//        // if word is pali
//        if (word == word.reversed()) {
//            firstPalindrome = word
//            return firstPalindrome
//        }
//    }
//
//    return ""

    // TODO naive solution with clear and easy way
//    return words.find { it.reversed() == it } ?: ""


    // TODO two pointer technique
    for (word in words) {
        if (isPalindrome(word, 0, word.length - 1))
            return word
    }


    // print("ada".length) == 3

    return ""


}


fun isPalindrome(word: String, start: Int, end: Int): Boolean {
    if (start >= end)
        return true

    if (word[start].toString() == word[end].toString()) {
        val s = start + 1
        val e = end - 1
        return isPalindrome(word, s, e)
    } else {
        return false
    }
}


val maxProductArray = intArrayOf(5, 6, 2, 7, 4)
fun maxProductDifference(nums: IntArray): Int {

    nums.sort()

    // clean solution
    return nums.sorted().run { (last() * this[lastIndex - 1]) - (first() * this[1]) }
    // return (nums[nums.size - 1] * nums[nums.size - 2])  -  (nums[0] * nums[1])


}

var truncate = "Hello how are you Contestant"
var k = 4
fun truncateSentence(s: String, k: Int): String {
    // Clean
    return s.split(" ").take(k).joinToString(" ")

    // Naive
//    val words: List<String> = s.split(" ")
//    val sb = StringBuilder()
//    for (i in 0 until k) {
//        sb.append(words[i] + " ")
//    }
//    //sb.append(words[k - 1])
//    sb.deleteCharAt(sb.lastIndex)
//    return sb.toString()


    // Naive
//    var newString = StringBuilder()
//    var totalSpace = 0
//
//
//    for (char in s.toCharArray()) {
//        if (totalSpace == k) {
//            if (newString.toString().last() == ' ') {
//                newString.deleteCharAt(newString.lastIndex)
//            }
//            break
//        }
//
//
//
//        newString.append(char)
//        if (char == ' ') {
//            totalSpace++
//        }

}


var imageDimensionalArray: Array<IntArray> =
    arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 0, 0))


fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {

    val twoDimArray: Array<IntArray> = image

    // flip
    for (i in twoDimArray.indices) {
        twoDimArray[i].reverse()
    }


    for (i in twoDimArray.indices) {
        for (number in twoDimArray[i].indices) {
            if (twoDimArray[i][number] == 1) {
                twoDimArray[i][number] = 0
            } else {
                twoDimArray[i][number] = 1
            }
        }
        println()
    }

    // TODO review this solution
    //image.map{ it.map{ i -> if( i == 1) 0 else 1 }.reversed()}

    return twoDimArray
}


// https://www.youtube.com/watch?v=IcgZ_q2XNWU
var pointsDimensionalArray: Array<IntArray> =
    arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))

fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var result = 0


    for (i in 1 until points.size) {
        var currentPoint = points[i - 1] // array 0 in case i == 1 like in the for-loop
        var nextPoint = points[i]  // array 1

        var distance1 = currentPoint[0] - nextPoint[0]  // 1 - 1
        var distance2 = currentPoint[1] - nextPoint[1]  //

        result += Math.max(Math.abs(distance1), Math.abs(distance2))
    }

    return result
}


val gain: IntArray = intArrayOf(-5, 1, 5, 0, -7)
fun largestAltitude(gain: IntArray): Int {
    /**
     * https://www.youtube.com/watch?v=tmZ_Ev1kZN8
     *
    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
     */
    var max = 0
    var sum = 0
    for (i in gain) {
        sum += i // 5
        if (sum > max) max = sum
    }
    return max
}


var rectangles: Array<IntArray> = arrayOf(
    intArrayOf(5, 8), intArrayOf(3, 9), intArrayOf(5, 12), intArrayOf(16, 5)
)

fun countGoodRectangles(rectangles: Array<IntArray>): Int {


    // clean solution
//    rectangles.groupBy{ it.minOrNull() }
//        .maxByOrNull { it.key!! }!!.value.size


    var largestRectangles = 0

    var largestSquares = mutableListOf<Int>()


    for (i in rectangles.indices) {
        val min = min(rectangles[i][0], rectangles[i][1])
        largestSquares.add(min)
    }


    val maxSquare = largestSquares.maxOrNull()

    largestRectangles = largestSquares.count { it == maxSquare }

    print(largestRectangles)

    return largestRectangles


}


val diagonalSumTwoArray: Array<IntArray> =
    arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))

fun diagonalSum(mat: Array<IntArray>): Int {

    val n = mat.size
    var sum = 0

    for (i in mat.indices) {
        sum += mat[i][i] + mat[i][n - i - 1]
    }

    if (n % 2 == 1) {
        sum -= mat[n / 2][n / 2]
    }


    return sum


}

val uniqueNums: IntArray = intArrayOf(1, 2, 3, 2)

fun sumOfUnique(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()

    for (i in nums) {
        if (map[i] == null) {
            map[i] = 0
        } else {
            map[i] = map.getValue(i) + 1
        }
    }

    var total = 0

    for ((key, value) in map) {
        if (value == 0)
            total += key
    }

    return total
}

val repeatedNums: IntArray = intArrayOf(1, 2, 3, 3)
fun repeatedNTimes(nums: IntArray): Int {

    val map = mutableMapOf<Int, Int>()

    for (i in nums) {
        if (map[i] == null) {
            map[i] = i
        } else {
            return i
        }
    }

    return 0
}


//val gcdNums = intArrayOf(2,5,6,9,10)
//fun findGCD(nums: IntArray): Int {
//    val maxNumber = nums.maxOrNull()
//    val minNumber = nums.minOrNull()
//    print(3%7)
//
//    return gcd(nums)
//    //return minNumber!! % maxNumber!!
//}
//


val digits: IntArray = intArrayOf(1, 2, 3)
fun plusOne(digits: IntArray): IntArray {


    val n = digits.size



    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits

        } else {
            digits[i] = 0
        }
    }



    // we came here mean's all digits were 9 and now 0
    val newDigits = IntArray(digits.size + 1)
    newDigits[0] = 1


    print(1)

    return newDigits
}



fun maxSubArray(nums: IntArray): Int {
    var max = Int.MIN_VALUE
    var current = 0
    nums.forEach {
        current = maxOf(current + it, it)
        max = maxOf(max, current)
    }

    return max
}






