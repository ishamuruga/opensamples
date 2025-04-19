package org.superduper.retailbank.lambdas

fun main(){

}

//Syntax of Anonymous Function
//val myVariableName: (FirstDataType,SecondDataType) -> ReturnType =     fun(firstParameter,secondParameter): ReturnType { MethodBody }

val myVariable1: (String, String) -> String = fun(a, b): String {
    return "$a $b"
}

val myVariable2 = fun(a:String,b:String): String { return "$a + $b" }

// When the method body contains just one statement,
// the return keyword and braces can be omitted.
val myVariable3 = fun(a:String,b:String): String = "$a + $b"

// Let's explore various anonymous function formats,
// depending on the parameters and return type.

// 1- With Parameters and No Return Value:
val myVariable = fun(a: String, b: String): Unit {
    println("$a $b")
}

// 2- With Parameters and Return Value:
val myVariable21 = fun(a: String, b: String): String {
    return "$a $b"
}

// 3- No Parameters and No Return Value:
val myVariable32 = fun(): Unit {
    println("No Parameters and No Return Value:")
}

// 4- No Parameters and Return Value:
val myVariable42 = fun(): String {
    return "Hi!"
}

fun main2() {
    myVariable("Hüseyin","Özkoç")
    println(myVariable2("Orkun","Ozan"))
//    myVariable3()
    println(myVariable4())
}