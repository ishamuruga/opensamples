fun main(){
    higherOrderFn("Welcome to Kotlin Class1",::println)
    higherOrderFn("Welcome to Kotlin Class2",::println)
    higherOrderFn("Welcome to Kotlin Class3",::println)
}

inline fun higherOrderFn(str:String,mycall: (String)->Unit) {
    mycall(str)
}