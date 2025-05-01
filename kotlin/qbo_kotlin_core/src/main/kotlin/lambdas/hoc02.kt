package org.superduper.retailbank.lambdas

fun mul(a: Int, b: Int): Int{
    return a*b
}

fun higherOrderFn() : ((Int,Int)->Int){
    return ::mul
}

val myAnonFn : (String,String)->String = fun(a,b):String {
    return "$a $b"
}

var myAnonFn2 =  fun(a:String,b:String):String = "$a $b"

fun main(){
    var fnv = higherOrderFn();
    println(fnv(10,25))

    println(myAnonFn2("Virtusa","Consulting"))
}