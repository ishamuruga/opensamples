abstract class Vehicle {
    abstract fun start()
}

class Bike : Vehicle() {
    override fun start() {
        println("Bike is starting...")
    }
}

fun main() {
    val bike = Bike()
    bike.start()  // Output: Bike is starting...
}