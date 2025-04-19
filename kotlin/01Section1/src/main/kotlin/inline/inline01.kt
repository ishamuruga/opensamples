package org.superduper.retailbank.inline

fun main(){
//    higherfunc("A Computer Science portal for Geeks",::println)

    var value = superduper(5,{x:Int -> x*x})

    value = superduper(10){x->x*x}

    print(value)
}

inline fun higherfunc( str : String, mycall :(String)-> Unit){
    // inovkes the print() by passing the string str
    mycall(str)
}

inline fun superduper(value:Int,transformation:(Int)->Int):Int{
    return transformation(value)
}