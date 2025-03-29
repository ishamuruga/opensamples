package org.example.oop

class PassengerCar(val namex: String, val colorx: String,numberOfPersons:Int) : AutoMobile(namex, colorx),OperateAuto {
    var numberOfPersons = 0

    init {
        this.numberOfPersons = numberOfPersons
    }

    fun noreturn(): Unit{
        println("dsdsddsdsds")
    }

    override fun display() {
        val  f = 23;


        println("Name: $name, Color: $color, Number of persons: $numberOfPersons")
    }

    override fun startVehile(): Boolean {
        return true;
    }

    override fun checkEngine() {
        println("Checking engine123456")
    }

    override fun checkTyrePressure() {
        println("Checking engine")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var pc = PassengerCar("Toyota", "Red", numberOfPersons = 4)

            pc.checkEngine();
        }
        const val adhaar="121212121212";
    }
}