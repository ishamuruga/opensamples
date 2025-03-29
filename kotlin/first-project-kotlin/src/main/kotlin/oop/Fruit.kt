package org.example.oop

abstract class Fruit (var name:String, var weight:Int) {
    open fun isSweer():Boolean{
        println("Fruit is sweet")
        return true;
    }

    abstract fun getSugarContent():Int
}