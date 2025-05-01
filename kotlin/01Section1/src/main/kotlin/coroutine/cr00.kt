package org.superduper.retailbank.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

//Structured concurrency
class cr00 {
    fun m1() = runBlocking { // this: CoroutineScope
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World!") // print after delay
        }

        println("Hello") // main coroutine continues while a previous one is delayed
    }



    //Extract function refactoring
    fun m2() = runBlocking {
        launch { doWorld() }
        println("Hello")
    }

    //Scope builder
    fun m3() = runBlocking{
        doWorld2 ()
    }

    fun m4()  = runBlocking {
        repeat(50_000) { // launch a lot of coroutines
            launch {
                delay(5000L)
                print(".")
            }
        }
    }

    // this is your first suspending function

    suspend fun doWorld() {
        delay(1000L)
        println("World X!")
    }

    suspend fun doWorld2() = coroutineScope {  // this: CoroutineScope
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
}

fun main(){
    val c = cr00()
    c.m4()
    println("End of main")
}