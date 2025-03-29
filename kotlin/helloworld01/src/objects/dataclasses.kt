data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("Alice", 25)
    val user2 = user1.copy(name = "Bob")
    println(user1) // Output: User(name=Alice, age=25)
    println(user2) // Output: User(name=Bob, age=25)
}