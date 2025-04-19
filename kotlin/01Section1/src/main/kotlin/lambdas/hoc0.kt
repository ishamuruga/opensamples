package org.superduper.retailbank.lambdas




// regular function definition
fun add(a: Int, b: Int): Int{
    var sum = a + b
    return sum
}
// higher-order function definition
fun higherfunc(addfunc:(Int,Int)-> Int){
    // invoke regular function using local name
    var result = addfunc(3,6)
    print("The sum of two numbers is: $result")
}


fun mul(a: Int, b: Int): Int{
    return a*b
}
//higher-order function declaration
fun higherfunc() : ((Int,Int)-> Int){
    return ::mul
}


fun main(args: Array<String>) {
    // invoke higher-order function
    higherfunc(::add)

    // invoke function and store the returned function into a variable
    val multiply = higherfunc()
    // invokes the mul() function by passing arguments
    val result = multiply(2,4)
    println("The multiplication of two numbers is: $result")
}