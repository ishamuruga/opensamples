package org.superduper.retailbank.companion

class PrvCons private constructor(var name:String) {
    companion object Factoryx {
        fun create(name:String) : PrvCons {
            return PrvCons(name)
        }
    }
}


fun main(){
    val p = PrvCons.create("Hüseyin")
    println(p.name)
    //val p1 = PrvCons("Özkoç") // Error: Cannot access 'PrvCons': it is private in file
    //println(p1.name)
}