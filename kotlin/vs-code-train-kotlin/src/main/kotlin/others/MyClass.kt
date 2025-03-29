package org.example.others

class MyClass {

    var name:String = ""

    lateinit var adhaarId:String

    fun setAdhaar(value:String) {
        adhaarId = value
    }

    fun isAdharrInitilized():Boolean {
        return this::adhaarId.isInitialized
    }
}

fun main(){
    var mclass = MyClass();
    mclass.setAdhaar("123445")
    println(mclass.adhaarId)

    var mclass2 = MyClass();
    if (mclass2.isAdharrInitilized()){

    }
}