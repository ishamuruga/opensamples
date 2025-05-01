//package org.superduper.retailbank.kotclause
//
//import java.sql.DriverManager.println
//
//class KTCloause01 {
//
//    init {
//        println("KTCloause01")
//    }
//
//    fun m1(){
//        var name:String? = "null"
//        var age:Int = 25
//
//        var ln = name?.let {
//            println(it.length)
//            age = age + it.length
//            it.length
//        }
//
//        //println(ln) // Output: 2
//
//   }
//
//    fun m2() {
//        println("m2()".uppercase())
//        val res = with("ABCD") {
//            println(uppercase())
////            println(length)
//            length
//        }
//
//       // println(res)
//
////        var comp = Computer("Dell", 1500.0)
////
////        var result2 = with(comp) {
////            println("Updated")
////            Computer("HP", 1200.0)
////        }
////
////        println("${result2.namex}===${result2.pricex}")
//
//    }
//
//    fun m3(){
//        //also
//
//        var lst = mutableListOf("Test","Mark","One").also {
//            it.add("Abhi")
//            it.add("Abhi123")
//
//            println(it)
//        }
//
//        //println(lst)
//
//    }
//
//}
//
//
//fun main(){
//    val k = KTCloause01()
//    println("===")
//    k.m2()
//}
//
//class Computer(var namex: String, var pricex: Double) {
//    fun printDetails() {
//        println("Computer Name: $namex")
//        println("Computer Price: $pricex")
//    }
//}