package org.superduper.retailbank.collections02



class Utils {
    fun printAll(strings: Collection<String>) {
        for(s in strings) print("$s ")
        println()
    }

    fun listequals(){
        val bob = Person("Bob", 31)
        val people = listOf(Person("Adam", 20), bob, bob)
        val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
        println(people == people2)
        bob.age = 32
        println(people == people2)
        println(people2[0]==people2[1])
    }
}


fun main(){
    val strings = listOf("a", "b", "c")
    val utils = Utils()
    //utils.printAll(strings) // Output: a b c


    val stringSet = setOf("one", "two", "three")
    //utils.printAll(stringSet)

    utils.listequals()

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()

    words.getShortWordsTo(shortWords, 3)
    //println(shortWords)
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {

    this.filterTo(shortWords) { it.length <= maxLength }

    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

class Person(var name: String, var age: Int) {


}