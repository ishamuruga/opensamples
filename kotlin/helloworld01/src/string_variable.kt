fun main(aargs: Array<String>) {
    println("Hello, \"yes\"Kotlin!")
    println("mylove")

    val pi: Int = Math.PI.toInt()

    var name = "android"
    println(name.uppercase())
    println(name)

    println(name + "," + "kotlin")
    println(pi.toString() + "," + "kotlin")

    val sb = StringBuilder()
    sb.append("Hello")
    sb.append(", ")
    sb.append("Kotlin")
    println(sb.toString())

    StringBuilder()
            .apply {
                append("Hello")
                append(", ")
                append("Kotlin")
            }
            .toString()
            .also { println(it) }

    val countr = 100

    println("Count is ${countr+1}")

    // multi line strings

    val thought =
            """
 Never give up on your dreams, 
 no matter how painful and 
 difficult your journey is."""

    println(thought.trimMargin())

    println(thought[2])

    var a1 = "abcdefgh"[4]

    println(a1)

    println("abcdefgh".get(5))

    val text: String = "SuperStar Rajinikanth"

    for (c in text) {
        println(c)
    }

    println("=====================================")

    text.forEach { c -> println(c) }

    val text1 = "Kotlin"
    for (i in text1.indices) {
        println(text1[i])
    }
}
