package org.superduper.retailbank.companion

class Comp {
    companion object {
        val staticProperty = "I am static"
        fun staticMethod() {
            println("Static method called!")
        }
    }
}

//named instance
data class MyClass(var n:String,var age:Int) {
    companion object Factory {
        fun create(): MyClass {
            return MyClass("John Doe", 30)
        }
    }
}

//Companion Object with Initializer

class MyClass2 {
    companion object {
        init {
            println("Companion object initialized")
        }

        val message = "Hello from companion object!"
    }
}

// Companion Object for Factory Pattern
class Product private constructor(val name: String) {
    companion object Factory {
        fun create(name: String): Product {
            return Product(name)
        }
    }
}



fun main() {
    // Accessing static-like property and method
    println(Comp.staticProperty)  // "I am static"
    Comp.staticMethod()  // "Static method called!"


    val myObject = MyClass.Factory.create()
    println(myObject)

    println(MyClass2.message)

    val product = Product.create("Laptop")
    println(product.name)  // "Laptop"
}