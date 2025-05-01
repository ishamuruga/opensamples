package org.superduper.retailbank.Let_Run_With_Apply_Also

class C01 {
    fun m01(){
        val result = "Hello".let {
            it.length
        }
        println(result) // Output: 5

        var name: String? = "Kotlin"
        name?.let {
            println("Name is $it")
        }


        // Similar to let but with the object as this.
        // Returns the result of the lambda.
        // Good for object configuration and computing results.
        val length = "Kotlin".run {
            println("This string is $this")
            length
        }

//        Not an extension function.
//        Used to call multiple methods on the same object.
//        Returns the result of the lambda.

        val result1 = with("Kotlin") {
            println(length)
            println(uppercase())
            length
        }

        var c = Computer("MacBook", 2000.0)
        val result2 = with(c) {
            println("Updating name to MacBook Pro")
            Computer("MacBook Pro", price)
        }
        println("Updated Computer: ${result2.name}, Price: ${result2.price}")

//        Returns the object itself.
//        Context object is it.
//        Used for side-effects like logging or debugging.
        val list = mutableListOf("A", "B", "C").also {
            println("Original list: $it")
        }


//        In Kotlin, apply is a scope function that's used to configure or initialize an object.
//        It lets you perform multiple operations on the object within a block,
//        and it returns the object itself. This is especially useful for object initialization.


        val userx = User("John", 25).apply {
            agex = 26
            namex = "John Doe"
            println("User name is $namex")
            println("Updated user age to $agex")
        }
        println(userx.toString())

    }
}

fun main() {
    val c = C01()
    c.m01()
}


class Computer(val name: String, val price: Double) {
    fun printDetails() {
        println("Computer Name: $name")
        println("Computer Price: $price")
    }
}

data class User(var namex: String, var agex: Int)