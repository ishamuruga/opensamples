package org.superduper.retailbank.getset


class Customer {


    var name:String =""
        get() = field.uppercase()
        set(value)  {
            println("set the value ${value}")
            field = value.lowercase()
        }

    var ccode:String = ""
    var age:Int = 0
        get() {
            println("Accessing age")
            return field+10
        }

//    fun getAge():Int{
//        return age
//    }

//    fun getName():String
}


fun main(){
    val cc = Customer()
    println(cc.name)
    println(cc.age)
//    println(cc.getCcode)
    cc.name = "Hüseyin"
}
