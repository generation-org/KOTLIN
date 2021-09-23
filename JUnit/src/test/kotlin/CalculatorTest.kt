import org.junit.jupiter.api.Assertions.assertEquals

internal class CalculatorTest {

    var calculator = Calculator()

    @org.junit.jupiter.api.Test
    fun addNumbers() {
        assertEquals( 7, calculator.addNumbers( 5, 3 ) );
    }

    @org.junit.jupiter.api.Test
    fun subtractNumbers() {
        assertEquals( 5, calculator.subtractNumbers( 10, 5 ) );
    }

    @org.junit.jupiter.api.Test
    fun divideNumbers() {
        assertEquals( 15, calculator.multiplyNumbers( 5, 3 ) );
    }

    @org.junit.jupiter.api.Test
    fun multiplyNumbers() {
        assertEquals( 7, calculator.divideNumbers( 5, 0 ) );
    }
}