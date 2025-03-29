package org.example.oop

class Banana(var name1:String, var weight1:Int, var color:String) : Fruit(name1, weight1),Harvest  {
    override fun getSugarContent(): Int {
        return 45;
    }

    override fun doIt() {
        println("do it")
    }

    override fun postCompletion() {
        println("postCompletion")
    }

    override fun beforStart() {
        println("beforStart")
    }

    fun getCalories(): Int {
        return weight1 * (Math.PI).toInt()
    }

}

fun main(){
    var banana = Banana("Banana", 13, "Yellow")
    println("Name: ${banana.name}")
    println("Weight: ${banana.weight}")
    println("Color: ${banana.color}")
    println("Calories: ${banana.getCalories()}")
    println("Is Sweet: ${banana.isSweer()}")
}