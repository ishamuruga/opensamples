class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount(1000.0)
    account.deposit(500.0)
    println("Balance: ${account.getBalance()}") // Output: Balance: 1500.0
}
