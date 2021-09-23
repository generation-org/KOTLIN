class Driver(val name: String, val id: String, val fee: Int) {
    var balance = 0.0
        private set
    var isAvailable = false
        private set

    fun startTrip() {
        isAvailable = false
    }

    fun endTrip() {
        isAvailable = true
        balance += balance
    }
}