import org.junit.*;

public class CalculatorSubTest {
    Calculator cal;
    @Before
    public void SetUp(){
        System.out.println("Test" + getClass().getName() + " is executed");
        cal = new Calculator();
    }

    @Test
    public void SubtractFromNegativeNumberAPositiveNumber(){
        System.out.println("Subtract From Negative Number A Positive Number");
        double a = -10;
        double b = 10;
        double expected = -20;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected, actual,0.1);
    }

    @Test
    public void SubtractNegativeNumbers(){
        System.out.println("Subtract 2 Negative Numbers");
        double a = -10;
        double b = -10;
        double expected = 0;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected,actual ,0.1);
    }

    @Test
    public void SubtractPositiveNumbers(){
        System.out.println("Subtract 2 Positive Numbers ");
        double a = 40;
        double b = 10;
        double expected = 30;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected,actual ,0.1);
    }

    @Test
    public void SubtractFromPositiveNumberANegativeNumber(){
        System.out.println("Subtract From Positive Number A Negative Number");
        double a = 10;
        double b = -5;
        double expected = 15;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected,actual ,0.1);
    }


    @Test
    public void SubtractFromZeroANegativeNumber(){
        System.out.println("Subtract From Zero A Negative Number");
        double a = 0;
        double b = -5;
        double expected = 5;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected,actual ,0.1);

    }

    @Test
    public void SubtractFromZeroAPositiveNumber(){
        System.out.println("Subtract From Zero A Positive Number");
        double a = 0;
        double b = 5;
        double expected = -5;
        double actual = cal.subtract(a,b);
        Assert.assertEquals(expected,actual ,0.1);
    }

    @After
    public void tearDown(){
        System.out.println("Test finished");
    }
}
