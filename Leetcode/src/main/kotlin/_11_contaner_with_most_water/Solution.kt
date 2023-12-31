package _11_contaner_with_most_water

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxWater = 0
        var start = 0
        var end = height.size - 1
        while (end > start){
            maxWater = max(maxWater, min(height[end], height[start]) * (end - start))
            if(height[end] > height[start]){
                start+=1
            }
            else{
                end-=1
            }
        }

        return maxWater
    }
}

fun main() {
    println(Solution().maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
}