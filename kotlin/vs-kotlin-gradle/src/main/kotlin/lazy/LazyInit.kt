package org.example.lazy

// val greet: (String) -> String by lazy {
//     println("Generating greeting message...")
//     { name -> 
//         val message = "Hello, $name!"
//         println("Generated message: $message")
//         message
//     }
// }
val greet: (String) -> String by lazy {
    // val isDebug = false  // could be configured via environment/properties
    // if (isDebug) println("Generating greeting message...")
    println("Generating greeting message...")
    { name -> 
        val message = "Hello, $name!"
        if (isDebug) println("Generated message: $message")
        message
    }
}


fun main(){
    
    // var met1:(Int)->Int by lazy = {a:Int -> 
    //     var res = a*a
    //     res
    // }

    val met1: (Int) -> Int by lazy { { a: Int -> a * a } }
    
    val answer : Int by lazy {
        println("Runinnnnnnnnnnnnnnnnnning")
        24
    }

   
 
    
    println(answer)
    println(answer)

    greet("John1")
    greet("John2")
}


