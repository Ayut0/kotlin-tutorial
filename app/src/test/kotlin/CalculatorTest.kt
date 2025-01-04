import com.example.demo.Calculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest{
     @Test
     fun shouldMultiplyBy2(){
         val calculator = Calculator()
         val result = calculator.parse("2 * 2")
         assertEquals(/* expected = */ result, /* actual = */ 4)
     }

    @Test
    fun shouldDivideBy2() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(/* expected = */ result, /* actual = */ 1)
    }
}