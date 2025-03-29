package org.example.oop

abstract class Fruit {

    var name: String = "";
    var color: String = "";

    constructor(n:String,clr:String){
        this.color = clr;
        this.name = n;
    }

    fun isSweet():Boolean{
        return true;
    }

    abstract fun doSomething();
}