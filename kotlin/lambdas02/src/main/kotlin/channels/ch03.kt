//package org.example.channels
//
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.channels.ReceiveChannel
//import kotlinx.coroutines.channels.produce
//import kotlinx.coroutines.cancelChildren
//import kotlinx.coroutines.cancelChildren
//import kotlinx.coroutines.*
//
//fun CoroutineScope.produceNumbers() = produce<Int> {
//    var x = 1
//    while (true) send(x++) // infinite stream of integers starting from 1
//}
//
//fun CoroutineScope.square(numbers: ReceiveChannel<Int>): ReceiveChannel<Int> = produce {
//    for (x in numbers) send(x * x)
//}
//
//fun main() = runBlocking {
//    val numbers = produceNumbers() // produces integers from 1 and on
//    val squares = square(numbers) // squares integers
//    repeat(5) {
//        println(squares.receive()) // print first five
//    }
//    println("Done!") // we are done
//    coroutineContext.cancelChildren() // cancel children coroutines
//}
//
