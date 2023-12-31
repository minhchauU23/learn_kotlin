package _1_Two_Sum

class Solution {
    //default parameters of fun are 'val'
    // meaning they are read-only
    // you cannot assign a new value
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Given an array of integers nums and an integer target,
        // return indices of the two numbers such that they add up to target.
        //
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.
        //2 <= nums.length <= 10^4
        //-10^9 <= nums[i] <= 10^9
        //-10^9 <= target <= 10^9

        //first solution is using 2 for loop
        //O(n^2)
        //second solution

        var map = mutableMapOf<Int, Int>()
        var s = nums.forEachIndexed { key, value ->
            map[target-value]?.let {
                return intArrayOf(it, key)
            }
            map[value] = key
        }

        throw IllegalStateException("no solution")
    }


}

fun main(){
    var sol = Solution()
    var res = sol.twoSum(intArrayOf(3, 2, 4), 6)
    res.forEach { print("$it ") }
}