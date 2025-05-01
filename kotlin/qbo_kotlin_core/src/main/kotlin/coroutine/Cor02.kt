package org.superduper.retailbank.coroutine

import kotlinx.coroutines.*

class Cor02 {

    fun m1() = runBlocking {
        doMyTask()
    }

    suspend fun doMyTask(){
        delay(1000L)
        println("Task completed!")
    }

    fun m2() = runBlocking {
        repeat(50_000) {
            launch {
//                delay(1000L)
                print(".")
            }
        }
    }

    fun m3x() = runBlocking {
        m3()
    }


    suspend fun m3() = coroutineScope {

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

fun main() {
    val cor02 = Cor02()
    cor02.m3x() // Call the method to see the output
}