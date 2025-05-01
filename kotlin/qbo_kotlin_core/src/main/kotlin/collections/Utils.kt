package org.superduper.retailbank.collections

class Utils {
    fun printall(strings : Collection<String>){
        for (s in strings){
            println(s)
        }
    }
}

fun main(){
    val strings = listOf("Hüseyin", "Özkoç")
    val stringSet = setOf("one", "two", "three")
    val u = Utils()
    u.printall(strings)
    u.printall(stringSet)
}