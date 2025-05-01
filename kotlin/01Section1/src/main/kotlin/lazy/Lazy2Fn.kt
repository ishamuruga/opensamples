package org.superduper.retailbank.lazy

fun <T> lazyFunction(block: () -> T): () -> T {
    val lazyValue = lazy(block)
    return { lazyValue.value }
}

val getGreeting = lazyFunction {
    println("Generating greeting...")
    "Hello from lazyFunction!"
}


fun main(){
    println("Before calling")
    println(getGreeting()) // First call: prints + returns
    println(getGreeting())
}