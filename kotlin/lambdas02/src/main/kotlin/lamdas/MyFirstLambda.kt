package org.example.lamdas

fun main(){
    var company = {
        println("Welcome to Kotlin")
    }

    company()

    company.invoke()

    val summ = { a: Int, b: Int -> a + b}
    val sum2:(Int,Int)-> Int  = { a , b -> a + b}
    var multiblock = { a: Int, b: Int ->
        val result = a * b
        println(result)
        result
    };
    var noreturn : (Int)-> Unit = { a->println(a)}

    var res = multiblock(5, 6)
    println("the valueis $res")
    println(summ(5, 6))

    val lambda4 : String.(Int) -> String = {
        val aa = this + "star"
        aa.plus(aa.length).plus(it)
    }

    println("Super".lambda4(50))

    fun main(args: Array<String>) {
        val result = "Geeks".lambda4(50)
        print(result)
    }

    val numbers = arrayOf(1,-2,3,-4,5)

    println(numbers.filter {item -> item > 0 })

    // anonymous function with body as an expression
    val anonymous1 = fun(x: Int, y: Int): Int = x + y

    // anonymous function with body as a block
    val anonymous2 = fun(a: Int, b: Int): Int {
        val mul = a * b
        return mul
    }

    //hoc
//    val sum2:(Int,Int)-> Int  = { a , b -> a + b}
    var operOnNumbers = { aa:Int, b:Int, operation: (Int,Int)->Int ->
        var a1 = aa*2;
        operation(a1,b)
    }
    fun add(x: Int, y: Int): Int = x + y

    val sum = operOnNumbers(5, 3, ::add)
    println(sum) // Output: 8

    // Using a lambda
//    val product = operOnNumbers(5, 3) { x, y -> x * y }
//    println(product) // Output: 15

    var getMultipler:(Int)->(Int)->Int = {factor -> {

            number -> number * factor
        }
    }

    val triple = getMultipler(3)  // Returns a function that multiplies by 3
    println(triple(10))

    fun getDiscountFunction(discount: Double): (Double) -> Double {
        return { price -> price * (1 - discount) }
    }

    val tenPercentOff = getDiscountFunction(0.10)
    println(tenPercentOff(100.0)) // Output: 90.0

}