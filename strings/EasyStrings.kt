package strings

fun main() {
    // minimumNumber(n = 3, password = password)
   // reverseString()
    fizzBuzz()
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