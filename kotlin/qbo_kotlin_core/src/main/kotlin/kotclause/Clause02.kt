package org.superduper.retailbank.kotclause

class Clause02 {

    fun m1(){

        var name:String? = "null"
        var age:Int = 6
        var result  = name.let {
            println(it?.length)
            age = age+ (it?.length ?:0)
            it?.length
        }



//        var p:Person? = Person("Hüseyin", 25, "Istanbul")
//        p = null
//        p.let {
//            age = age + (p?.age ?: 10)
//        }
//
//        println("===")
//        println(result)
//        println(age)
    }

    fun m2(){
        val numbers = mutableListOf("one", "two", "three")
        numbers
            .also { println("The list elements before adding new one: $it") }
            .add("four")

        println(numbers)
    }

    fun m3(){
        var p = Person("", 0, "")
        p.apply {
            name = "Hüseyin"
            age = 25
            city = "Istanbul"
        }

        val message = StringBuilder().apply {
            append("Hello, ")
            append("Kotlin!")
        }.toString()

        println(message)

        println(p)
    }

    fun m4() {
        val message = "Hello, world!"
        val upperCaseMessage = message.run {
            uppercase()
        }
        println(upperCaseMessage) // output: "HELLO, WORLD!"
    }

    fun m5(){
        val person = Person("John", 30, "New York")
        with (person) {
            println("Name: $name")
            println("Age: $age")
            println("City: $city")
            name = "Super Star"
        }

        println(person)
    }
}

fun main(){

    val c = Clause02()
    c.m1()
}

data class Person(var name: String, var age: Int, var city:String) {

    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }

}