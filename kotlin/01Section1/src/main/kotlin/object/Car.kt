package org.superduper.retailbank.`object`

const val SERIAL_ID: String = "1234567890"

class Car {
    public var color: String = "red"

    private var vin: String = "1234567890"

    protected var engine: String = "V8"

    internal var model: String = "Sedan"

    val currentTime = System.currentTimeMillis()

    fun printCarDetails() {
        println("Color: $color")
        println("VIN: $vin")
        println("Engine: $engine")
        println("Model: $model")
    }
}

fun main(){
    var c1:Car = Car()

    var c2:Car = Car()
}