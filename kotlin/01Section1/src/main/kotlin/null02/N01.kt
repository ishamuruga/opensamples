package org.superduper.retailbank.null02

class N01 {
    fun greetUser(name: String?) {

        var salary:Int = 0;
        //Elvis Operator
        val userName = name ?: "Guest"
        println("Hello, $userName!")

        // Safe call + let
        name?.let {
            println("Length of name: ${it.length}")
            salary = it.length *100
            println(salary)
        }
    }
}


fun main(){
    val n = N01()
    n.greetUser("Hüseyin")
    n.greetUser(null)
}