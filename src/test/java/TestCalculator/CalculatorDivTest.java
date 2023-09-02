import org.junit.*;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

public class CalculatorDivTest {
    Calculator cal;

    @Before
    public void SetUp(){
        System.out.println("Test" + getClass().getName() + " is executed");
        cal = new Calculator();
    }

    @Test
    public void DividePositiveNumbers(){
        System.out.println("Divide 2 positive numbers");
        double a = 5;
        double b = 10;
        double expected = 0.5;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void DivideNegativeNumbers(){
        System.out.println("Divide 2 negative numbers");
        double a = -5;
        double b = -10;
        double expected = 0.5;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void DividePositiveByNegativeNumbers(){
        System.out.println("Divide positive by negative number");
        double a = 5;
        double b = -10;
        double expected = -0.5;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test
    public void DivideNegativeByPositiveNumbers(){
        System.out.println("Divide negative by positive number");
        double a = -5;
        double b = 10;
        double expected = -0.5;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test(expected = InvalidParameterException.class)
    public void DivideByZero(){
        System.out.println("Divide by zero");
        double a = -8;
        double b = 0;
        double expected = 0;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test(expected = InvalidParameterException.class)
    public void DivideZeroByPositiveNumber(){
        System.out.println("Divide zero by positive number");
        double a = 0;
        double b = 100;
        double expected = 0;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test(expected = InvalidParameterException.class)
    public void DivideZeroByNegativeNumber(){
        System.out.println("Divide zero by negative number");
        double a = 0;
        double b = -4;
        double expected = 0;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @Test(expected = InvalidParameterException.class)
    public void DivideZeroByZero(){
        System.out.println("Divide zero by zero ");
        double a = 0;
        double b = 0;
        double expected = 0;
        double actual = cal.divide(a,b);
        assertEquals(expected, actual,0.1);
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Test finished");
    }
}
