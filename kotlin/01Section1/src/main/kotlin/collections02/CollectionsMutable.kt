package org.superduper.retailbank.collections02

class CollectionsMutable {
    fun m1(){
        var mutableList = mutableListOf("Mahipal","Nikhil","Rahul")
        // we can modify the element
        mutableList[0] = "Praveen"
        // add one more element in the list
        mutableList.add("Abhi")
        mutableList.add("Abhi123")
        for(item in mutableList){
            println(item)
        }
    }

    fun m2(){
        var mutableSet = mutableSetOf(6,9,9,0,0,"Mahipal","Nikhil")
        // we can modify the element
        mutableSet.add(7)
        for(item in mutableSet){
            println(item)
        }
    }

    fun m3(){
        var mutableMap = mutableMapOf<Int,String>(1 to "Mahipal",2 to "Nikhil",3 to "Rahul")
        // we can modify the element
        mutableMap.put(1,"Praveen")
        // add one more element in the list
        mutableMap.put(4,"Abhi")
        for(item in mutableMap.values){
            println(item)
        }
    }
}

fun main(){
    var obj = CollectionsMutable()
    obj.m3()
}