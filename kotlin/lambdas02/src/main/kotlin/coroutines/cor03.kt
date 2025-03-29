package org.example.coroutines

//Scope Builder

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
    println("=======================================")
}

suspend fun doWorld() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}