package random

fun main() {
    // searchRange(nums, target)
    // topKFrequent()
    //  search(nums = intArrayOf(-1,0,3,5,9,12), target = 9)
    // sortColors(nums = intArrayOf(2,0,2,1,1,0))
    intersect(nums1 = intArrayOf(4, 9, 5), nums2 = intArrayOf(9, 4, 9, 8, 4))
}

var nums = intArrayOf(5, 7, 7, 8, 8, 10)
var target = 8

fun searchRange(nums: IntArray, target: Int): IntArray {
    var result: IntArray = intArrayOf(-1, -1)
    calc_nums(nums, result, true, target)
    calc_nums(nums, result, false, target)

    return result
}

fun calc_nums(nums: IntArray, result: IntArray, goLeft: Boolean, t: Int) {
    var left: Int = 0
    var right: Int = nums.size - 1

    while (left <= right) {
        var midd: Int = left + (right - left) / 2
        if (nums[midd] > t) {
            right = midd - 1
        } else if (nums[midd] < t) {
            left = midd + 1
        } else {
            if (goLeft == true) {
                if (midd == 0 || nums[midd - 1] != t) {
                    result[0] = midd
                    return
                } else {
                    right = midd - 1
                }
            } else {
                if (midd == nums.size - 1 || nums[midd + 1] != t) {
                    result[1] = midd
                    return
                } else {
                    left = midd + 1
                }
            }
        }
    }
}


var singleNumber = intArrayOf(2, 2, 1)

fun singleNumber(nums: IntArray): Int {
    val hashmap = hashMapOf<Int, Int>()
    for (num in nums) {
        if (hashmap.containsKey(num)) {
            hashmap[num] = hashmap.getValue(num) + 1
        } else {
            hashmap[num] = 1
        }
    }

    for ((key, value) in hashmap) {
        if (value == 1)
            return key
    }

    return 0

}


fun topKFrequent(): IntArray {
    var nums = intArrayOf(1, 1, 1, 2, 2, 3)
    var k = 2

    val map = mutableMapOf<Int, Int>()

    nums.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

    for ((i, v) in map) {
        print("index $i = " + " $v")
    }
    val pairs = map.toList().sortedByDescending { it.second }
    println()
    for (i in pairs) {
        print(i)
    }

    val uniques = mutableListOf<Int>()



    pairs.forEach {
        while (uniques.size < k) {
            uniques.add(it.first)
            break
        }
    }

    return uniques.toIntArray()


}


fun search(nums: IntArray, target: Int): Int {
    // binary search -1,0,3,5,9,12, target = 9
    // return the index
    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val medium = l + (r - l) / 2
        if (nums[medium] == target) {
            return medium
        }

        if (nums[medium] < target) {
            l = medium + 1
        } else {
            r = medium - 1
        }
    }

    return -1


}


fun sortColors(nums: IntArray): Unit {
    val n = nums.size - 1

    for (i in 0 until n) {
        for (j in 0 until n - i) {
            print("${nums[j].toString() + "" + nums[j + 1] + " - "}")
        }
        println()
    }


//    print(nums)
}


fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    // nums 1 = [1,2,2,1], nums2 = [2,2]
    val map = hashMapOf<Int, Int>()
    val list = mutableListOf<Int>()

    for (i in nums1) {
        if (map[i] == null) {
            map[i] = 1
        } else {
            map[i] = map[i]!! + 1
        }
    }


   for (i in nums2) {
       if (map[i] != null && map[i]!! > 0) {
           list.add(i)
           map[i] = map[i]!! - 1
       }
   }

    print(list)

    return list.toIntArray()
}

