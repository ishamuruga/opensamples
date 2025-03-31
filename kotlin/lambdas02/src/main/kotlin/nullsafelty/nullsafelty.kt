package org.example.nullsafelty

fun main() {
    var s1 : String = "Geeks"
//    s1 = null
    println(s1.length)

    var s2:String? = "super"
    s2 = null
    //safe call operastor
    println(s2?.length)

    if (s2 == null) {
        println("s2 is null")
    } else {
        println(s2.length)
    }

    var stringlist: List<String?> = listOf("Geeks","for", null, "Geeks")
    var newlist = listOf<String?>()
    for (item in stringlist) {
        // executes only for non-nullable values
        item?.let { newlist = newlist.plus(it) }
    }
    // to print the elements stored in newlist
    for(items in newlist){
        println(items)
    }

    //Elvis Operator

    val name: String? = null
    val displayName = name ?: "Unknown"
    println("Name: $displayName") // Output: Name: Unknown

    val text: String? = null
    println("Length: ${getLength(text)}") // Output: Length: 0

}


fun getLength(text: String?): Int {
    return text?.length ?: 0
}
