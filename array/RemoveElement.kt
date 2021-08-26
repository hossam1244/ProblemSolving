package array


fun main() {
    var nums: IntArray = intArrayOf(3,2,2,3)
    val value = 3
    println(removeElement(nums = nums,`value` = value))

}


fun removeElement(nums: IntArray, value : Int) : Int {
    // remove the value nums from the nums
    // then return the length of the left numbers in the nums

    var move = 0
    for (index in nums.indices) {
        nums[index - move] = nums[index]
        if (nums[index] == value) {
            move++
        }
    }
    return nums.size - move
}

