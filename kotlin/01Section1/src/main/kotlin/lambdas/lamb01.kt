package org.superduper.retailbank.lambdas

fun main(){
    fn5(5,"added")
//    println({a: String, b: String -> "$a $b"} ("Hüseyin", "Özkoç"))
}

var fn = {println("hello world")}
var fn1:()->Unit = { println("hello world") }
val fn2: (Int, String) -> String = { a: Int, b: String -> "$a + $b" }
var fn3  = { a: Int, b: String -> "$a + $b" }
val fn4: (Int, String) -> String = { a, b -> "$a + $b" }
val fn5: (Int, String) -> String = { a, b ->
    println("a: $a")
    println("b: $b")
    "$a + $b"
}

val myVariable4: () -> String = { "Return String" }

