import org.example.calculatorSimple;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorSimpleTest {
    calculatorSimple calculator = new calculatorSimple();
    protected static int num1;
    protected static int num2;
    protected static int num3;
    @BeforeAll
    public static void parameter(){
        num1 = 5;
        num2 = 4;
        System.out.println("parameter setting, run before all");
    }

    @AfterAll
    public static void afterAll(){
        num1 = 0;
        num2 = 0;
        System.out.println("Clear!");
    }

    @Test
    public void testSum(){
        assertEquals(9, calculator.sum(num1, num2));
        System.out.println("expected:"+ calculator.sum(num1, num2));
    }
    @Test
    public void testMinus(){
        assertEquals(1, calculator.minus(num1,num2));
        System.out.println("expected:"+ calculator.minus(num1, num2));
    }
    @Test
    public void testTimes(){
        assertEquals(20, calculator.times(num1,num2));
        System.out.println("expected:"+ calculator.times(num1, num2));
    }
    @Test
    public void testDivide(){
        assertEquals(1, calculator.divide(num1,num2));
        System.out.println("expected:"+ calculator.divide(num1, num2));
    }
}
