package org.superduper.retailbank.lazy

class LazyClass {
    val myValue: String by lazy {
        println("Initializing now...")
        "Hello from lazy!"
    }
}

fun main (){
    var ll = LazyClass()
    println(ll.myValue)
    println("======================")
    println(ll.myValue)
}

//    Feature         | lazy                  | lateinit              | Nullable ?
//    Keyword         | by lazy {}            | lateinit var          | var/val name: T?
//    Type            | val only              | var only              | val or var
//    Null-safe       | ✅ Always non-null    | ✅ Always non-null    | ❌ Can be null
//    Thread-safe     | ✅ by default         | ❌ Not thread-safe     | ✅ (nullable check)
//    Use case        | Delayed calculation   | Injected later        | Optional data}
