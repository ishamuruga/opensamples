open class Animal {
    open fun makeSound() {
        println("Some sound...")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof! Woof!")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound() // Output: Woof! Woof!
}