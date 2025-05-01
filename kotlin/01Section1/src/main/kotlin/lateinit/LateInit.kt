package org.superduper.retailbank.lateinit

class LateInit {
    lateinit var name: String

    lateinit var lp:Laptop;

    init {
        lp=Laptop()
    }

    fun initUser() {
        name = "Alice"
//        lp = Laptop()
    }

    fun printName() {
        println(name) // Will crash if not initialized!
        println(lp)
    }

    fun isNameInitialized(): Boolean {
        return this::name.isInitialized
    }
}

class Laptop {}

fun main(){
    var l = LateInit()
    l.initUser()
    l.printName()
    println(l.isNameInitialized()) // Output: false
}