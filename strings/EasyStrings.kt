package strings

fun main() {
    minimumNumber(n = 3, password = password)
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