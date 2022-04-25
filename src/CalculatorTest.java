import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void TestCalculadora(){
        assertEquals(123123125, calc.sum(123123123, 2 ));
        assertEquals(451, calc.substract(500, 49 ));
        assertEquals(459, calc.multiply(51, 9 ));
        assertEquals(123, calc.divide(492, 4));
    }

}
