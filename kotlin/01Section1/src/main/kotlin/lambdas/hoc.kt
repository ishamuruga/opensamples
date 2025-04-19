package org.superduper.retailbank.lambdas

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult1 = calculate(4, 5, { a, b -> a * b })
//    Trailing Lambda Syntax: Kotlin provides a cleaner way to write this by moving the lambda outside the parentheses:
    val mulResult2 = calculate(4, 5) { a, b -> a * b }
//    This syntax improves readability, especially when the lambda is long or complex. It is purely syntactic sugar and does not change the behavior of the code.// 5
    println("sumResult $sumResult, mulResult $mulResult1")
}

fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main2x() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}