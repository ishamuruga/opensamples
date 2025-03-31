package org.example.scope

//Let, Run, With, Apply, Also

fun main(){
    //Used for performing operations on the object. It returns the last expression inside its block
    var name: String? = "Kotlin"
    name = "null"
    name?.let {
        println("Name is not null: $it")
        println("Name length: ${it.length}")
    }

    //Used to execute a block of code and return the result. It is similar to  but more focused on computation or running multiple operations.
    val result = "Kotlin".run {
        println("Inside run for: $this")
        length // Returns length of the string
    }
    println("Result: $result") // Output: Result: 6

    //Used for calling multiple methods or properties on the object. Unlike others, it does not operate on a nullable object and requires the object as an argument.
    val person = Person("John", 30)
    println(person.toString())
    with(person) {
        println("Name: $namex")
        println("Age: $age")
    }
    //Used when configuring or initializing an object. It operates on the object and returns the same object.
    var person2 = Person("John", 30).apply {
        age += 1 // Modifies the object
        namex = "John Doe"
    }
    println(person2)

    //Commonly used for debugging or logging intermediate steps.

    val namey = "Kotlin".also {
        println("Original name: $it")
    }
    println("Final name: $namey")




//    val name = "John Doe"
//    val length = name.let {
//        println("The length of the string is: ${it.length}")
//        it.length
//    }
//    println("Length of the string is: $length")
//
//    val result = name.run {
//        println("The length of the string is: ${this.length}")
//        this.length
//    }
//    println("Length of the string is: $result")
//
//    val person = Person("John", 30)
//    person.apply {
//        age = 31
//        println("Name: $name, Age: $age")
//    }
//
//    person.also {
//        it.age = 32
//        println("Name: ${it.name}, Age: ${it.age}")
//    }
}

data class Person(var namex: String, var age: Int)
