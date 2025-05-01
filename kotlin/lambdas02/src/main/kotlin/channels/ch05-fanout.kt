package org.example.channels

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() = runBlocking<Unit> {
    val producer = produceNumbers()
    repeat(2) { launchProcessor(it, producer) }
    repeat(3) { launchProcessor2(it, producer) }
    delay(950)
    producer.cancel() // cancel producer coroutine and thus kill them all
}

fun CoroutineScope.produceNumbers() = produce<Int> {
    var x = 1 // start from 1
    while (true) {
        send(x++) // produce next
        delay(100) // wait 0.1s
    }
}

fun CoroutineScope.launchProcessor(id: Int, channel: ReceiveChannel<Int>) = launch {
    for (msg in channel) {
        println("#Processor #1 #$id received $msg")
    }
}

fun CoroutineScope.launchProcessor2(id: Int, channel: ReceiveChannel<Int>) = launch {
    for (msg in channel) {
        println("@Processor #2 #$id received $msg")
    }
}

