package org.superduper.retailbank.lambdas

fun main(){
//    fn1()
//    println(fn3(5,"added"))
//   println({a: String, b: String -> "$a $b"} ("Hüseyin", "Özkoç"))
}

val fn1 = {
    println("hello world")
}

var fn2: (Int,String) -> String = { age:Int, name:String -> "$age,$name"}

var fn4  = { a: Int, b: String -> "$a + $b" }


var fn3:(Int,String) -> String = { age:Int, name:String ->
    var tAge = age+30
    "The Customer with Name $name is of age $tAge"
}