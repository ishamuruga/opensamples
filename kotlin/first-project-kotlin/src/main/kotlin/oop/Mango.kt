package org.example.oop

class Mango(var name1:String, var weight1:Int, var gLoc:String) : Fruit(name1, weight1) {
    override fun isSweer(): Boolean {
        var b = super.isSweer();
        return false
    }

    override fun getSugarContent(): Int {
        return 45;
    }

    fun getCalories(): Int {

        return weight1 * (Math.PI).toInt()
    }
}

fun main(args: Array<String>) {
    var mango = Mango("Mango", 13, "India")
    println("Name: ${mango.name}")
    println("Weight: ${mango.weight}")
    println("Location: ${mango.gLoc}")
    println("Calories: ${mango.getCalories()}")
    println("Is Sweet: ${mango.isSweer()}")
}