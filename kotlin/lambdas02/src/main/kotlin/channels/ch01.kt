package org.example.channels

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    var channel = Channel<Int>()

    // Sender coroutine
    launch {
        for (i in 1..5) {
            println("Sending: $i")
            channel.send(i) // Suspends if no receiver
        }
        channel.close() // Important to close the channel
    }

    // Receiver coroutine
     launch {
         for (num in channel) { // Receives until the channel is closed
             println("Received: $num")
         }
     }
}

