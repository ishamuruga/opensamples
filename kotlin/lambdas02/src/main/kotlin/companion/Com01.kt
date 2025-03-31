package org.example.companion

class Com01 {
    var a:String="test"
//    companion object {
//        val message = "Hello from Companion"
//        fun showMessage() = println(message)
//    }


    companion object MyCompanion {
        val message = "Custom Named Companion"
    }
}

class PersonX private constructor(val name: String) {
    companion object {
        fun create(name: String): PersonX {
            return PersonX(name)
        }
    }
}


fun main() {
    //println(Com01.showMessage())
    println(Com01.MyCompanion.message) // Output: Custom Named Companion

    val person = PersonX.create("John")
    println("Person name: ${person.name}")
}
