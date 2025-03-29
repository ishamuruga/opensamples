package org.example.questionmark

fun main(){
    var name: String? = null
//    var age: Int = null
    name = "Hi"
    name=null
    println(name?.length)

    //!! The !! operator forces a nullable variable to be treated as non-null.
    //If the variable is null, it will throw a NullPointerException.
    name = "Hi2"
    println(name!!.length)

    //safe casting
    //If the cast fails, as? returns null instead of throwing an exception.
    val obj: Any = "Hello"
    val str: String? = obj as? String  // Safe cast
    println(str) // Output: Hello

    //    Using ?.let {} to Execute Code Only If Not null
    val name2: String? = "Alice"
    name2?.let {
        x->println("Hello, $x!")  // Executes only if name is NOT null
    }
}