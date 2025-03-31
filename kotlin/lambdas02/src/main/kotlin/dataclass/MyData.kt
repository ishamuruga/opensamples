package org.example.dataclass

data class MyData(val name: String, val age: Int)
data class MyData2(val name: String="none", val age: Int=10)

fun main() {
    val user1 = MyData("Alice", 25)

    // Using generated toString()
    println(user1) // Output: User(name=Alice, age=25)

    // Using generated copy() to create a new instance with modified properties
    val user2 = user1.copy(age = 26,name="simran")
    println(user2) // Output: User(name=Alice, age=26)

    // Automatically generated equals() and hashCode()
    println(user1 == user2) // Output: false

    val (name, age) = user1
    println("Name: $name, Age: $age") // Output: Name: Bob, Age: 30

}
