package org.superduper.retailbank.lambdas

fun doCalculate(x:Int,y:Int,oper: (Int,Int)->Int) : Int {
    println("Calling Passed Function....")
    return oper(x,y)
}

fun add(x:Int,y:Int): Int {
    return x+y
}

fun multiply(x:Int,y:Int): Int {
    return x*y
}


fun main(){
    println(doCalculate(10,20,::add))
    println(doCalculate(10,20,::multiply))



    //Trailing Lamda Syntax

    val result = doCalculate(40,20) {a,b ->
        var a1=a+10
        a1*b}
    println(result)

    println(doCalculate(10,20,{a,b->a*a*b}))
}