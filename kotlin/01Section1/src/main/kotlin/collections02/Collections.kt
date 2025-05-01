package org.superduper.retailbank.collections02

class Collections {
    fun m1(){

        var list = listOf(1,2,3,4,5)

        println(list)
        println(list[0])
        println(list.get(0))
        println(list.size)
        println(list.indexOf(3))
        println(list.lastIndexOf(3))
        println(list.contains(3))
        println(list.isEmpty())
        println(list.isNotEmpty())
    }

    fun m2(){
        val immutableList = listOf("Mahipal","Nikhil","Rahul")
        // gives compile time error
//        immutableList.add = "Praveen"
//        immutableList.stream().map { x->x+" Kumar" }
//            .forEach { x-> println(x) }
        for(item in immutableList){
            println(item)
        }
    }

    fun m3(){
        // initialize with duplicate values
        // but output with no repetition
        var immutableSet = setOf(6,9,9,0,0,"Mahipal","Nikhil")
        // gives compile time error
        // immutableSet.add(7)
        for(item in immutableSet){
            println(item)
        }
    }

    fun m4(){
        var immutableMap = mapOf(9 to "Mahipal",8 to "Nikhil",7 to "Rahul", "start" to SuperStar())
        // gives compile time error
        // immutableMap.put(9,"Praveen")
        for(key in immutableMap.keys){
            println(immutableMap[key])
        }
    }
}

fun main(){
    var c = Collections()
//    c.m1()
    c.m4()
}

class SuperStar {

}