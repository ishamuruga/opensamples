package org.example.channels

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun CoroutineScope.producer() = produce {
    for (i in 1..5) {
        println(i*2)
        send(i * 2) // Send even numbers
    }
}

fun main():Unit = runBlocking {
    val channel = producer()
    channel.consumeEach { value ->
        println("Received: $value")
    }
}