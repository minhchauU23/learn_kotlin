package _22_generate_parentheses

import java.util.Stack

class Solution {
    fun checkParenthese(s: CharArray): Boolean {
        var stack = Stack<Char>()
        s.forEach {
            if (it == '(') stack.push(it)
            else {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    return false
                }
            }
        }
        return stack.empty()
    }

    fun backTrack(s: CharArray, position: Int, mutableList: MutableList<String>, openPT: Int) {
        if(position == s.size){
            if (checkParenthese(s))
                mutableList.add(String(s))
            return
        }
        if( openPT < s.size/2){
            s[position] = '('
            backTrack(s, position + 1, mutableList, openPT + 1)
        }
        if( position - openPT < s.size/2){
            s[position] = ')'
            backTrack(s, position + 1, mutableList, openPT )
        }
    }

    fun generateParenthesis(n: Int): List<String> {
        var result = mutableListOf<String>()
        var s = CharArray(n * 2)
        backTrack(s, 0, result, 0 )
        return result
    }
}

class User(){
    var name: String
    init {
        name = ""
    }
    constructor( name: String) : this(){
        this.name = name
    }
}

data class A(val x: String){

}



sealed class AB(){
    abstract fun a()
}
class AC:AB(){
    override fun a() {

    }
}
open class AS constructor(){
    protected class C(){

    }
     fun get() : Int{
         val c = C()
        return 100
    }
}

private class ass() : AS(){
    fun get2(){
        val c =
    }
}

fun main() {
//    Solution().generateParenthesis(3 ).forEach {
//        println(it)
//    }
    val validateName : (User) -> Unit = {
        a: User ->
        a.name = "SSS"
    }
    var sg = mapOf(1 to 2, 2 to 3)
    var sss = AS()
    sss.get()
    val user = User()
    println(user.name)
    validateName(user)
    println(user.name)
    var a = 1
    val cs = AS.



}