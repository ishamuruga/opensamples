package org.example.oop

class Truck (var brand:String,var ladenWight:Int) {

    //internal
    //private
    //this()

    fun printdata(){
        println("Brand: $brand")
        println("Laden Weight: $ladenWight")
    }
}

fun main(args:Array<String>) {
    var truck = Truck("Toyota", 1000)
    truck.printdata()
}