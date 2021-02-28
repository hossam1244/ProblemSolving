package array

import java.util.HashMap


// nums = [2,7,11,15], target = 9

fun main(args: Array<String>) {
    println("Hello World!")


    var nums: IntArray = intArrayOf(3, 2, 4)
    System.out.print(twoSum(nums = nums, 6))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size - 1)
        for (j in i + 1 until nums.size)
            if (nums[i] + nums[j] == target)
                return intArrayOf(
                    i, j
                )
    return IntArray(2)
}


fun twoSumOptimized(nums: IntArray, target: Int): IntArray {
    var map = hashMapOf<Int, Int>()
    for (i in 0 until nums.size -1) {
        if (map.containsKey(target - nums[i]))
            return intArrayOf(i, map[target - nums[i]]!!)
        map[nums[i]] = i
    }

    return IntArray(2)

}