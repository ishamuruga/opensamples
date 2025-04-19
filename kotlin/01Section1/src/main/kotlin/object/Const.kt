package org.superduper.retailbank.`object`

class Const(var brand: String, var model: String, var year: Int)


class Auto(var brand: String, var model: String, var year: Int) {
    init {
        println("Person initialized with name = $brand and age = $model")
    }

    var vin:String = ""

    constructor(brand:String, model: String,vin:String) : this(brand, model, 2000) {
        this.vin = vin
        println("Secondary constructor called with brand = $brand and model = $model")
    }
}

fun main(){
//    var c1:Const = Const("BMW", "X5", 2020)
//    var c2:Const = Const("Mercedes", "C-Class", 2021)

    var c3:Auto = Auto("Audi", "A4", 2022)
    var c4:Auto = Auto("Toyota", "Camry", "1234567890")
    println(c4.vin)

//    println("Car 1: ${c1.brand} ${c1.model} ${c1.year}")
//    println("Car 2: ${c2.brand} ${c2.model} ${c2.year}")
}