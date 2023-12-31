package _5_longest_palindromic_substring

class Solution {
    fun longestPalindrome(s: String): String {
        var grid = Array(s.length){
            Array(s.length){""}
        }
        grid[0].forEachIndexed { index, value ->
            grid[0][index] = "${s[index]}"
        }
        var result = "${s[0]}"
        for(i in 1 until s.length){
            for(j in i until s.length){
                if(s[i] == s[j]){
                    grid[i][j] = "${s[i]}${grid[i-1][j-1]}${s[j]}"
                    result = if(result.length < grid[i][j].length) grid[i][j] else result
                }
                else{

                }
            }
        }

        return ""
    }
}