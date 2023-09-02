import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorMulTest {
    Calculator cal;

    @Before
    public void SetUp(){
        System.out.println("Test" + getClass().getName() + " is executed");
        cal = new Calculator();
    }

    @Test
    public void MultiplyPositiveNumbers(){
        System.out.println("Multiply 2 positive numbers");
        double a = 5;
        double b = 10;
        double expected = 50;
        double actual = cal.multiply(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void MultiplyNegativeNumbers(){
        System.out.println("Multiply 2 negative numbers");
        double a = -5;
        double b = -10;
        double expected = 50;
        double actual = cal.multiply(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void MultiplyPositiveAndNegativeNumbers(){
        System.out.println("Multiply positive by negative number");
        double a = -5;
        double b = 10;
        double expected = -50;
        double actual = cal.multiply(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void MultiplyByZero(){
        String name = this.getClass().getName();
        System.out.println("Multiply by zero");
        double a = 0;
        double b = -10;
        double expected = 0;
        double actual = cal.multiply(a,b);
        assertEquals(expected, actual,0.1);
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Test finished");
    }
}
