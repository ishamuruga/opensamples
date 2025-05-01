package org.superduper.retailbank.collections

class Coll01 {
    fun a1(){
        var list = listOf("one","two","three")



        for (a in list) {
            //println(a)
        }

        var sets = setOf("one","two","three","one")

        for (a in sets) {
            println(a)
        }

        var maps = mapOf("one" to 1, "two" to 2, "three" to 3,"auto" to Auto())
    }

    fun a2(){
        var l2= mutableListOf("one","two","three")


        l2.add("four")
        l2[0] = "five"
        for(a in l2){
            println(a)
        }


    }

}


fun main() {
    val c = Coll01()
    c.a2()
}

class Auto{}