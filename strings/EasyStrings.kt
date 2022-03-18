package strings

import java.lang.Exception
import java.util.*

fun main() {
    // minimumNumber(n = 3, password = password)
    // reverseString()
    // fizzBuzz()
    // print(isPalindrome())
    // print(isAnagram())
    // titleToNumber()
    romanToInt()
}


val password: String = "Ab1"
fun minimumNumber(n: Int, password: String): Int {
    var lc = 0
    var uc = 0
    var no = 0
    var sc = 0
    var sum = 0
    var lowercase = ".*[a-z]+.*".toRegex()
    val uppercase = ".*[A-Z]+.*".toRegex()
    val num = ".*[0-9]+.*".toRegex()
    val specialchar = ".*[-!@#$%^&*()+]+.*".toRegex()
    //Regex for pattern matching
    if (!password.matches(lowercase)) lc++
    //if there is no match to a lowercase,"lc" is increased by 1.
    if (!password.matches(uppercase)) uc++
    //if there is no match to an uppercase,"uc" is increased by 1.
    if (!password.matches(num)) no++
    //if there is no match to a number,"no" is increased by 1.
    if (!password.matches(specialchar)) sc++
    //if there is no match to a specialCharacter,"sc" is increased by 1.
    sum = lc + uc + sc + no
    return if (sum > 6 - n) sum else 6 - n
}


fun reverseString(): Unit {
    var s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
    var pointerLeft = 0
    var pointerRight = s.size - 1

    s.forEach {

        if (pointerLeft < pointerRight) {
            val left = s[pointerLeft]
            val right = s[pointerRight]
            s[pointerLeft] = right
            s[pointerRight] = left
            pointerLeft++
            pointerRight--
        }
    }


    print(s)
}


fun fizzBuzz(): List<String> {
    var n = 3
    val list = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            list.add("FizzBuzz")
        } else if (i % 3 == 0) {
            list.add("Fizz")
        } else if (i % 5 == 0) {
            list.add("Buzz")
        } else {
            list.add("$i")
        }
    }

    return list

}


fun isPalindrome(): Boolean {
    var s = "A man, a plan, a canal: Panama"
    if (s.isBlank())
        return true
    var new = s.filter { it.isLetterOrDigit() }.lowercase(Locale.getDefault())


    var pointerLeft = 0
    var pointerRight = new.length - 1
    while (pointerLeft < pointerRight) {
        if (new[pointerLeft] != new[pointerRight]) {
            return false
        } else {
            pointerLeft++
            pointerRight--
        }
    }

    return true
}

fun isAnagram(): Boolean {
    var s = "aacc"
    var t = "ccac"


    if (s.length != t.length)
        return false

    val map = mutableMapOf<Char, Int>()

    for (i in s) {
        if (map[i] == null)
            map[i] = 1
        else
            map[i] = map.getValue(i) + 1
    }
    print(map)

    for (i in t) {
        if (map[i] == null || map.getValue(i) < 0) {
            return false
        } else {
            map[i] = map.getValue(i) - 1
            if (map.getValue(i) < 0)
                return false
        }
    }

    println(map)
    return true


    // Solution 2
    //  s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())

    // Solution 3
//    val tArr = Array(26) {0}

//    t.forEach { tArr[it - 'a']++ }
//    s.forEach { tArr[it - 'a']-- }
//    return tArr.all {it == 0}
//


}


fun titleToNumber(): Int {
    //  AA here means 26 + A = 27
    // BB  == 26 + b = 28
    val columnTitle = "ABC"
    // var count = 0
//
//    return if (columnTitle.length == 1) {
//        columnTitle[0] - 'A' + 1
//    } else {
//        val count = (columnTitle.length - 1) * 26
//        print('Y' - 'A')
//        val final = columnTitle.last() - 'A' + 1
//       // print(final)
//        //print(count + final)
//        count + final
//    }


    var res = 0
    for (ch in columnTitle) {
        print(ch - 'A' + 1)
        res = res * 26 + (ch - 'A' + 1)                   //alpha is base 26
    }
    return res


}


fun romanToInt(): Int {
    val map = mutableMapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )

    var s = "III"
    var res = 0



    for (i in s.indices) {
        try {
            if ((i + 1 < map.size - 1) &&  (map.getValue(s[i]) < map.getValue(s[i + 1])) ) {
                res -= map.getValue(s[i])
            } else {
                res += map.getValue(s[i])
            }
        } catch (e: Exception) {
            res += map.getValue(s[i])

        }

    }

    print(res)
    return res




//    var number = 0
//    var last = 1000
//    s.forEach {
//        val value = map[it] ?: 0
//        if (value > last) number -= last * 2
//        number += value
//        last = value
//    }
//
//    print(number)
//    return number
}


