package org.superduper.retailbank.`object`

open class Fruit(val name: String, val color: String) {
    fun printDetails() {
        println("Fruit Name: $name")
        println("Fruit Color: $color")
    }

//    abstract fun doSomething(a:Int):Int;
}

class Mango:Fruit("name", "yellow") {
    fun printMangoDetails() {
        println("This is a mango.")
    }
}

fun main(){
    val mango = Mango()
    mango.printDetails() // Output: Fruit Name: name, Fruit Color: yellow
    mango.printMangoDetails() // Output: This is a mango.
}