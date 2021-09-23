import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class DriversManagerTest {


    private val driversManager = DriversManager()

    @BeforeEach
    fun setUp() {
        driversManager.addPassenger(Passenger("Carlos", "44234", 100))
        driversManager.addPassenger(Passenger("Elise", "533434", 100))
        driversManager.addPassenger(Passenger("Ian", "5343433", 100))
        driversManager.addPassenger(Passenger("Debbie", "44555521", 100))
        driversManager.addPassenger(Passenger("Cleon", "559988", 100))
        driversManager.addPassenger(Passenger("Santiago", "1203123", 100))
        driversManager.addDriver(Driver("Emilio", "1234990", 100))
        driversManager.addDriver(Driver("Pedro", "12312440", 120))
        driversManager.addDriver(Driver("Constanza", "9824990", 110))
    }

    @Test
    fun addPassenger() {
    }

    @Test
    fun addDriver() {
    }

    @Test
    fun getDriver() {
    }

    @Test
    fun getPassenger() {
    }

    @Test
    fun startTrip() {
    }

    @Test
    fun endTrip() {
    }

    @Test
    fun findNextAvailableDriver() {
    }
}