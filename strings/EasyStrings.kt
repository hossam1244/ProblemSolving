package strings

import java.util.*

fun main() {
    // minimumNumber(n = 3, password = password)
   // reverseString()
   // fizzBuzz()
    // print(isPalindrome())
    print(isAnagram())
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
    var s = charArrayOf('H','a','n','n','a','h')
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
        }
        else  {
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

    val map = mutableMapOf<Char,Int>()

    for (i in s) {
        if (map[i] == null)
        map[i] =  1
        else
        map[i] = map.getValue(i) + 1
    }
    print(map)

    for (i in t) {
        if (map[i] == null || map.getValue(i) < 0) {
            return false
        } else  {
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


