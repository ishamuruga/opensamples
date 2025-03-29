package org.example.oop

abstract class AutoMobile(val name: String, val color: String) {
    fun start() {
        println("AutoMobile started")
    }

    fun stop() {
        println("AutoMobile stopped")
    }

    open fun display() {
        println("Name: $name, Color: $color")
    }

    abstract fun startVehile():Boolean;
}