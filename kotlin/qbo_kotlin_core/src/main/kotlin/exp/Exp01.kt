package org.superduper.retailbank.exp

class Exp01 {
    fun m1(){
        try {
            val numbers = listOf(1, 2, 3)
//            var a = checkAge(30);
            riskyOperation()
            println(numbers[5])
        } catch (e: IndexOutOfBoundsException) {
            println("Index out of range")
        } catch (e: IllegalArgumentException) {
            println("IllegalArgumentException: ${e.message}")
        }
        catch (e: MyCustomException) {
            println("MyCustomException: ${e.message}")
        }
        catch (e: Exception) {
            println("Something went wrong: ${e.message}")
        } finally {
            println("Always executes this block")
        }
    }

    fun checkAge(age:Int) {
        if (age > 99){
            throw IllegalArgumentException("Invalid age (higher)")
        }
    }

    fun riskyOperation() {
        throw MyCustomException("Something went wrong in the operation!")
    }
}

fun main() {
    val exp = Exp01()
    exp.m1()
}

class MyCustomException(message: String) : Exception(message)