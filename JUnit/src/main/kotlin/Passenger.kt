class Passenger(val name: String, val id: String) {

    private var balance = 0.0
    private var isOnTrip = false

    fun addBalance(balance: Double) {
        this.balance += balance
    }

    fun hasEnoughBalance(balance: Double): Boolean {
        return this.balance > balance
    }

    constructor(name: String, id: String, balance: Int) : this(name, id)

    fun startTrip() {
        isOnTrip = true
    }

    fun endTrip(fee: Int) {
        balance -= fee
        isOnTrip = false
    }
}