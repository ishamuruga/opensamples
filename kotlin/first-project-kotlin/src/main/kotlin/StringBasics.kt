package org.example

fun main(){
    val name = "Kotlin"

    println(name.uppercase())

    println(name.plus(" is awesome!"))

    val sb = StringBuilder()
    sb.append("Hello")
    sb.append(", ")
    sb.append("Kotlin")
    println(sb.toString())

    StringBuilder()
        .apply {
            append("Hello")
            append(", ")
            append("Kotlin2")
        }
        .toString()
        .also { println(it) }
}