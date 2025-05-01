package org.superduper.retailbank.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class Cor01 {

    fun m1() = runBlocking {

        launch {
            delay(1000L)
            println("Launch Completed1")
        }

        launch {
            delay(1000L)
            println("Launch Completed2")
        }

        println("Main Program")

    }
}

fun main(){
    val c = Cor01()
    c.m1()
}