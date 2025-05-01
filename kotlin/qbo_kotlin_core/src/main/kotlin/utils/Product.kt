package org.superduper.retailbank.utils

class Product {
    var id:Int = 0;

    var name:String = ""
        get() = field.uppercase()
        set(value) {
            println("set the value ${value}")
            field = value.lowercase()
        }

    fun printProduct(){
        println("Product ID: $id")
        println("Product Name: $name")
    }
}

fun main(){
    var product = Product()
    product.id = 1
    product.name = "Laptop"
    println(product.name)
//    product.printProduct()
}