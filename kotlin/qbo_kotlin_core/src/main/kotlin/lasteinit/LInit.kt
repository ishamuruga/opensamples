package org.superduper.retailbank.lasteinit

class LInit {
    var cm:ComputerMouse? = null;

    lateinit var cCode:String

    fun doInit(){
        cCode = "C123"
    }

    fun doPrint(){
        cm = ComputerMouse()
        if (this::cCode.isInitialized){
            println(cCode)
        } else {
            println("Please check your code....")
        }


    }
}

class ComputerMouse {}

fun main(){
    var ll = LInit()
    ll.doInit()
    println(ll.doPrint())
}