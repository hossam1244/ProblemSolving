package array


fun main() {
    val account1: IntArray = intArrayOf(1, 5)
    val account2: IntArray = intArrayOf(7, 3)
    val account3: IntArray = intArrayOf(3, 5)
    val accounts: Array<IntArray> = arrayOf(account1, account2, account3)
    print("max " + maximumWealth(accounts = accounts))
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max: Int = 0
    val map = hashMapOf<Int, Int?>()
    for (i in accounts.indices) {
        for (j in accounts[i].indices) {
            if (map[i] != null) {
                map[i] = accounts[i][j] + map[i]!!
            } else {
                map[i] = accounts[i][j]
            }

        }
    }

    for ((key, value) in map) {
        println("$key = $value")
        value.let {
            max = Math.max(max, it!!)
        }

    }

    return max
}

fun maximumWealth2(accounts: Array<IntArray>): Int {
    var max = 0
    for (customer in accounts) {
        var wealthSum = 0
        for (wealth in customer) {
            wealthSum += wealth
        }
        max = Math.max(max, wealthSum)
    }
    return max
}







