import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun `should sum 3 plus 3`() {
        val calculator = Calculator()
        val result = calculator.parse("3 + 3")
        assertEquals(6, result)
    }

    @Test
    fun `should subtract 3 minus 3`() {
        val calculator = Calculator()
        val result = calculator.parse("3 - 3")
        assertEquals(0, result)
    }

    @Test
    fun `should multiply 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun `should divide 2 by 2`() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1, result)
    }

    @Test
    fun `should throw ArithmeticException when divide 2 by 0`() {
        val calculator = Calculator()
        assertThrows<ArithmeticException> { calculator.parse("2 / 0") }
    }

    @Test
    fun `should throw IllegalArgumentException when pass invalid operator`() {
        val calculator = Calculator()
        assertThrows<IllegalArgumentException> { calculator.parse("2 @ 2") }
    }

    @Test
    fun `should throw IllegalArgumentException when pass empty parameter`() {
        val calculator = Calculator()
        assertThrows<IllegalArgumentException> { calculator.parse("") }
    }

    @Test
    fun `should throw IllegalArgumentException when pass invalid expression`() {
        val calculator = Calculator()
        assertThrows<IllegalArgumentException> { calculator.parse("2 * 2 * 2") }
    }
}