package org.superduper.retailbank.scopefn

class MyScope {
    fun letm1(){
        var code:String? = null

        var st:String = "Open"
        var result = code.let {
            println("Code is $it")
            st = "Closed"
        }

        println(st)
    }

    fun m2Also() {
        val numbers  = mutableListOf("a", "b", "c")

        numbers.also {
            println("Data is ${it}")
        }.add("d")

        println(numbers)
    }

    fun m3Apply(){
        var p = Person("xyz",20,"Hyderabad")
        p.apply {
            city = "Bangalore"
        }

        println(p)

        val message = StringBuilder("Test").apply {
            append("Data..")
            append("k2..")
        }
    }

    fun m4run(){
        val message = "Virtusa Consulting"

        var uc=  message.run {
            uppercase()
        }

        println(uc)
    }

    fun m5With(){
        var p = Person("xyz",20,"Hyderabad")
        with (p) {
            println("Name is $name")
            println("Age is $age")
            println("City is $city")
            name = "SuperStar"
        }

        println(p.name)
    }


}

fun main(){
    var m = MyScope()
    m.m5With()
}

class Person(var name: String, var age: Int, var city: String) {
    override fun toString(): String {
        return "Person(name='$name', age=$age, city='$city')"
    }
}