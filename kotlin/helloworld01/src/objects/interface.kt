interface Flyable {
    fun fly()
}

class Bird : Flyable {
    override fun fly() {
        println("Bird is flying")
    }
}

fun main() {
    val bird = Bird()
    bird.fly()  // Output: Bird is flying
}