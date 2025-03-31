package org.example.sealed

//In Kotlin, a sealed class is a special type of class used for representing restricted hierarchies.
// It allows you to define a fixed set of subclasses and ensures that all subclasses are known at compile-time.
// This makes sealed classes ideal for modeling states, results, or events in a type-safe manner.

sealed class Mysealed {
    class Success(val data: String) : Mysealed()
    class Error(val message: String) : Mysealed()
    object Loading : Mysealed()

}

fun handleResult(result: Mysealed) {
    when (result) {
        is Mysealed.Success -> println("Success: ${result.data}")
        is Mysealed.Error -> println("Error: ${result.message}")
        Mysealed.Loading -> println("Loading...")
    }
}

fun main() {
    val result = Mysealed.Success("Data fetched successfully!")
    handleResult(result) // Output: Success: Data fetched successfully!
}

