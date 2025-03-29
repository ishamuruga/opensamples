package org.example.lateint

//✔ Use lateinit when you’re sure the property will be initialized before use.

class lint {
    lateinit var name: String  // Declared but not initialized

    fun setUserName(userName: String) {
        name = userName  // Now initialized
    }

    fun printUserName() {
        println("User name is: $name")  // Safe to access after initialization
    }

    fun isNameInitialized(): Boolean {
        return this::name.isInitialized
    }
}


fun main() {
    val user = lint()
    if (user.isNameInitialized()) {
        println(user.name)
    } else {
        println("Name is not initialized yet!")  // Output: Name is not initialized yet!
    }
    user.setUserName("Alice") // Initialize it before use
    user.printUserName()  // Output: User name is: Alice
}

//Feature	                                lateinit var	var? (nullable)
//Works with var	                        ✅ Yes	        ✅ Yes
//Works with val	                        ❌ No	        ✅ Yes
//Works with primitives (Int, Double)	    ❌ No	        ✅ Yes
//Checked before use (isInitialized)	    ✅ Yes	        ❌ No
//Requires explicit null check	        ❌ No	        ✅ Yes