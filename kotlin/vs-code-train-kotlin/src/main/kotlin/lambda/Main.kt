package org.example.lambda

fun main() {
//    println(add(4,5))
//    printdata()
//    var result = summation(6,7)
//    println(result)
//    println(summation2(5,7))

//    println("Rajinikanth".secretOperation(10))

    val names = arrayOf("virtusaa", "polaris", "bright consulting")

    names.forEach { x ->
//        println(x)
    }

    val aaax = names.filter { x-> x.length % 2==0 }
//    println(aaax)


    var operOnNumbers = {aa:Int,bb:Int,operation:(Int,Int)->Int ->
        var xy = aa+bb;
        operation(100,xy)
    }

    fun addfn(x: Int, y: Int): Int = x + y

    var resultx1 = operOnNumbers(5,6,summation1)
    var resultx2 = operOnNumbers(5,6,::addfn)

    println(resultx1)
    println(resultx2)

//    println(resultx)

    var areafn:(Int)->(Int)->Int = {factor ->{
        number -> number* factor
    }}

    var resultX3 = areafn(5)
    println(resultX3(100))

}

fun add(x:Int,y:Int):Int {
    return x + y
}


var summation1 = {x:Int,y:Int -> x+y}
var summation5:(Int,Int)->Int = {x,y -> x+y}

var summation2 = {x:Int,y:Int ->
    var xx = x+10;
    var yy = y+56;

    val result = xx+yy
    result
}

var doSomethingaKeepQuit:(Int,Int)->Unit = {x:Int,y:Int ->
    var xx = x+10;
    var yy = y+56;

    val result = xx+yy
    println(result)
}

val printdata = {
    println("Hello")
}

val secretOperation :String.(Int) -> String = {
    val res = this.length.toString().plus("SuperStar")
    res.plus(it).plus("-").plus(this)
}






//Basket of Apples
//
//Day1 : Only Red Apples
//        Day2: Only Green Apples
//        Day3: One Green, but wt is more than 100
//
//














