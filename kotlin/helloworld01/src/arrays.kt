fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    cars[1] = "Mercedes"
    println(cars[1])

    cars.set(2, "Audi")
    println(cars[2])

    println(cars.size)

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }

    // Array COnstructor

    val squares = Array(5) { i -> (i + 1) * (i + 1) }
    val squares1 = Array(5) { index -> index + 2 }
    println(squares1.joinToString()) // Output: 1, 4, 9, 16, 25

    // Using Primitive Type Arrays (Optimized for performance)
    val intArray = intArrayOf(1, 2, 3, 4)
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    val charArray = charArrayOf('a', 'b', 'c')

    // size
    println(charArray.size)

    // Check if an element exists

    println(3 in intArray) // Output: true

    intArray.forEach { println(it) }

    val sortedNumbers = squares.sortedArray()
    println(sortedNumbers.joinToString())

    // reverse

    squares.reverse()
    println(squares.joinToString())

    // add an element

    var sq1 = squares.plus(36)
    println(sq1.joinToString())

    // toMutableList()

    val numbers = arrayOf(1, 2, 3)
    val mutableList = numbers.toMutableList() // Convert to MutableList
    mutableList.add(4) // Add new element
    val newArray = mutableList.toTypedArray() // Convert back to Array
    println(newArray.joinToString()) // Output: 1, 2, 3, 4
}

// error: syntax error: Unexpected tokens (use ';' to separate expressions on the same line).
