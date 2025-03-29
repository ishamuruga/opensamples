package org.example.oop

class Car {
    var brand = ""
    var model = ""
    var year = 0
    var vin:String="";

    constructor(brand: String, model: String, year: Int, vin: String) {
        this.brand = brand
        this.model = model
        this.year = year
        this.vin = vin
    }

    override fun toString(): String {
        return "Car(brand='$brand', model='$model', year=$year, vin='$vin')"
    }
//
//    companion object {
//        @JvmStatic
//        fun main(args: Array<String>) {
//            print("from Car clas")
//            val car = Car("Toyota", "Corolla", 2021, "123456789")
//            println("Brand: ${car.brand}")
//            println("Model: ${car.model}")
//            println("Year: ${car.year}")
//            println("VIN: ${car.vin}")
//        }
//    }
}

//fun mani (){
//    val car = Car("Toyota", "Corolla", 2021, "123456789")
//    println("Brand: ${car.brand}")
//    println("Model: ${car.model}")
//    println("Year: ${car.year}")
//    println("VIN: ${car.vin}")
//}