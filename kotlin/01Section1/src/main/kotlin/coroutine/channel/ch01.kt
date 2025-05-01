package org.superduper.retailbank.coroutine.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Ch01 {

    fun m2(): Unit = runBlocking {
//        val channel = Channel<Int>()
        val channel = Channel<Int>(capacity = 3) // Buffered channel with capacity 3

        launch {
            for (i in 1..20) {
                channel.send(i)
                delay(1000)
            }
            channel.close()  // Don't forget to close the channel when done
        }

        launch {
            for (received in channel) {
                println("Received: $received")
            }
        }
    }

}

fun main() {
    val ch01 = Ch01()
    ch01.m2()
}