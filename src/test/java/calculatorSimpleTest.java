import org.example.calculatorSimple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorSimpleTest {
    calculatorSimple calculator = new calculatorSimple();

    @Test
    public void testSum(){
        assertEquals(20, calculator.sum(10, 15));
    }
    public void testMinus(){
        assertEquals(5, calculator.minus(10,5));
    }
    public void testTimes(){
        assertEquals(125, calculator.times(25,5));
    }
    public void testDivide(){
        assertEquals(25, calculator.divide(125,5));
    }
}
