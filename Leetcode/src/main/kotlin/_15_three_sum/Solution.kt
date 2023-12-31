package _15_three_sum

import java.util.HashMap
import java.util.SortedMap
import kotlin.time.Duration.Companion.seconds

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result = mutableListOf<List<Int>>()
        var map :SortedMap<Int, Int> = sortedMapOf()
        nums.forEach {value->
                map[value] = map[value]?.let { it + 1 }?:1
        }
        var ls = map.toList()
        var cur = 0

        while(cur < ls.size && ls[cur].first <=  0){
            if(ls[cur].first == 0 ){
                if(ls[cur].second >= 3)
                result.add(listOf(0, 0, 0))
            }

            var first = cur + 1
            var end = ls.size - 1
            while(first < end) {
                if (ls[first].first + ls[end].first + ls[cur].first == 0) {
                    result.add(listOf(ls[cur].first, ls[first].first, ls[end].first))
                    first++
                    end--
                } else if (ls[first].first + ls[end].first + ls[cur].first < 0) {
                    first++
                } else end--
            }
            if( ls[cur].first != 0 && ls[cur].second >= 2 && map.containsKey(0 - 2 * ls[cur].first)){
                result.add(listOf(ls[cur].first, ls[cur].first, 0- 2 * ls[cur].first))
            }
            if( ls[cur].first != 0 && ls[cur].first % 2 == 0 && map[- ls[cur].first/2]!! >= 2){
                result.add(listOf(ls[cur].first, - ls[cur].first/2, - ls[cur].first/2))
            }
            cur ++
        }
        return result
    }
}

fun main() {
    println(Solution().threeSum(intArrayOf(0, 0, 0, 0)))


}