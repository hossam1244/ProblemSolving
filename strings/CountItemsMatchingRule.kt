package strings


fun main() {
    val listOfList = listOf(listOf("phone","blue","pixel"), listOf("computer","silver","lenovo"), listOf("phone","gold","iphone"))
    countMatches(items = listOfList,ruleKey = "color",ruleValue = "silver")
}
fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var total = 0

        for (i in items.indices) {
            println(items[i])
            if (ruleKey == "type") {
                if (items[i][0] == ruleValue) {
                    total += 1
                }
            } else if (ruleKey == "color") {
                if (items[i][1] == ruleValue) {
                    total += 1
                }
            } else if (ruleKey == "name") {
                if (items[i][2] == ruleValue) {
                    total += 1
                }
            }
        }


    return total
}