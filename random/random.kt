package random

fun main() {
searchRange(nums, target)
}

var nums = intArrayOf(5,7,7,8,8,10)
var target = 8

fun searchRange(nums: IntArray, target: Int): IntArray {
    var result: IntArray = intArrayOf(-1,-1)
    calc_nums(nums, result, true, target)
    calc_nums(nums, result, false, target)

    return result
}

fun calc_nums(nums: IntArray, result: IntArray, goLeft: Boolean, t: Int) {
    var left: Int = 0
    var right: Int = nums.size - 1

    while (left <= right) {
        var midd: Int = left + (right - left) / 2
        if(nums[midd] > t) {
            right = midd - 1
        } else if(nums[midd] < t) {
            left = midd + 1
        } else {
            if(goLeft == true) {
                if(midd == 0 || nums[midd - 1] != t) {
                    result[0] = midd
                    return
                } else {
                    right = midd - 1
                }
            } else {
                if(midd == nums.size - 1 || nums[midd + 1] != t) {
                    result[1] = midd
                    return
                } else {
                    left = midd + 1
                }
            }
        }
    }
}