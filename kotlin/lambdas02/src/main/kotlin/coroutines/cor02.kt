package org.example.coroutines

// package org.example.coroutines

 import kotlinx.coroutines.CoroutineScope
 import kotlinx.coroutines.delay
 import kotlinx.coroutines.launch
 import kotlinx.coroutines.runBlocking

 // Define constants
 private const val DELAY_TIME = 1000L

//Let's extract the block of code inside launch { ... } into a separate function.
// When you perform "Extract function" refactoring on this code, you get a new function w
// ith the suspend modifier. This is your first suspending function. Suspending functions can
// be used inside coroutines just like regular functions, but their additional feature is
// that they can, in turn, use other suspending functions (like delay in this example) to
// suspend execution of a coroutine.
//
 // Separate the coroutine logic into a dedicated function
 private suspend fun printDelayedMessage(message: String, delayTime: Long) {
     delay(delayTime)
     println(message)
 }

 fun main() = runBlocking {
     // Launch coroutine with a more descriptive name
     val delayedMessageJob = launch {
         printDelayedMessage("World!", DELAY_TIME)
     }

     println("Hello")

     // Optionally wait for the coroutine to complete
     delayedMessageJob.join()
 }
