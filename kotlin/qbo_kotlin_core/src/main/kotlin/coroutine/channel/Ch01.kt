package org.superduper.retailbank.coroutine.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch

class Ch01 {
    fun m1() = runBlocking{
        var channel = Channel<Int>(capacity = 3)

        launch {
            for (x in 1..5) {
                channel.send(x * x)
            }
            channel.close()
        }

        launch {
            for (data in channel) {
                println("Received: $data")
            }
        }

        launch {
            for (data in channel) {
                println("Received2: $data")
            }
        }
    }
}

fun main() {
    var ch01 = Ch01()
    ch01.m1()
}