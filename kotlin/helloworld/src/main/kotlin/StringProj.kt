package org.example

fun main(args:Array<String>) {
    var a = "India"
    var b = a

    if (a.compareTo(b)==0){
        println("Both are equal")
    }else{
        print("Both are not equal")
    }

    if (a == b){
        println("xBoth are equal")
    }else{
        print("xBoth are not equal")
    }
}