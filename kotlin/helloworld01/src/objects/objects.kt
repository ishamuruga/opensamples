// primary constructor

class Car(val brand: String, val model: String) {
    fun drive() {
        println("$brand $model is driving!")
    }
}

fun main() {
    val car1 = Car("Toyota", "Corolla")
    car1.drive() // Output: Toyota Corolla is driving!
}
// secondary constrictu

class Student {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
