package org.superduper.retailbank.null02

class Safe {
    fun m00(){
        val name: String? = null
        val length = name?.length
        println(length) // Output: null
    }
}

fun main(){
    val u = User("Hüseyin", 25)
    var nname = u.name?.length

    val message: String? = null
    message?.let { println(it.uppercase()) } // Won’t print anything
//    val city = user?.address?.city

}


class User(var name:String?, var age:Int){}