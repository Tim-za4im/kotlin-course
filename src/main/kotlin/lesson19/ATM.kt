package lesson19

class ATM {
    var balance: Int = 0

    fun showBalance() {
        println("Текущий баланс: $balance")
    }

    fun deposit(amount: Int) {
        require(amount > 0) { "Сумма для пополнения должна >0." }
        balance += amount
        println("Положено $amount. Новый баланс: $balance")
    }

    fun withdraw(amount: Int) {
        require(amount > 0) { "Сумма для снятия должна >0." }
        require(balance >= amount) { "Недостаточно средств на счете." }
        balance -= amount
        println("Снято $amount. Остаток на счету: $balance")
    }
}