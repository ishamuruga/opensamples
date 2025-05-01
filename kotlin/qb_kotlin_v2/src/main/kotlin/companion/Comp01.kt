package org.superduper.retailbank.companion

data class Comp01(var code:Int, var name:String) {

    var age:Int = 0

    fun m1(){
        println("Comp01 m1 method called!")
    }

    companion object Factory {
        init {
            println("Companion object initialized")
        }
        fun create() : Comp01 {
            return Comp01( 1, "Virtusa")
        }
        fun createAbbs() : Comp01 {
            return Comp01( 1, "Virtusa")
        }
    }




//    companion object {
//        var s1Property = "Virtusa Consulting"
//        fun doStatic(){
//            println("Static method called!")
//            println(s1Property)
//        }
//    }
}

fun main() {
// println(Comp01.s1Property)
// println(Comp01.doStatic())

    var c = Comp01.Factory.create();
    println(c)
}
