import java.util.HashMap

class DriversManager {
    private val passengersMap: HashMap<String, Passenger?> = HashMap<String, Passenger?>()
    private val driversMap = HashMap<String, Driver?>()
    fun addPassenger(passenger: Passenger) {
        passengersMap[passenger.id] = passenger
    }

    fun addDriver(driver: Driver) {
        driversMap[driver.id] = driver
    }

    fun getDriver(driverId: String): Driver? {
        return driversMap.getOrDefault(driverId, null)
    }

    fun getPassenger(passengerId: String): Passenger? {
        return passengersMap.getOrDefault(passengerId, null)
    }

    fun startTrip(passengerId: String, driverId: String) {
        if (passengersMap.containsKey(passengerId) && driversMap.containsKey(driverId)) {
            passengersMap[passengerId]?.startTrip()
            val driver = driversMap[driverId]
            driver!!.startTrip()
        }
    }

    fun endTrip(passengerId: String, driverId: String) {
        if (passengersMap.containsKey(passengerId) && driversMap.containsKey(driverId)) {
            val driver = driversMap[driverId]
            driver!!.endTrip()
            passengersMap[passengerId]?.endTrip(driver.fee)
        }
    }

    fun findNextAvailableDriver(): String {
        return "driver_id"
    }
}