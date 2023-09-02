import org.junit.*;

public class CalculatorSumTest {
    Calculator cal;

    @Before
    public  void SetUp(){
        System.out.println("" + getClass().getName() + " is executed");
        cal = new Calculator();
    }
    @Test
    public void SumNegativeNumbers(){
        System.out.println("Sum 2 Negative Numbers ");
        double a = -10;
        double b = -10;
        double expected = -20;
        double actual = cal.sum(a,b);
        Assert.assertEquals(expected, actual,0.1);
    }

    @Test
    public void SumPositiveNumbers(){
        System.out.println("Sum 2 Positive Numbers ");
        double a = 10;
        double b = 10;
        double expected = 20;
        double actual = cal.sum(a,b);
        Assert.assertEquals(expected, actual,0.1);
    }

    @Test
    public void SumNegativeAndPositiveNumber(){
        System.out.println("Sum Negative And Positive Number ");
        double a = -10;
        double b = 10;
        double expected = 0;
        double actual = cal.sum(a,b);
        Assert.assertEquals(expected, actual,0.1);
    }

    @Test
    public void SumNegativeAndPositiveNumberNegativeTest(){
        System.out.println("Sum Negative And Positive Number ");
        double a = -10;
        double b = 10;
        double expected = -1;
        double actual = cal.sum(a,b);
        Assert.assertEquals(expected, actual,0.1);
    }


    @AfterClass
    public static void tearDown(){
        System.out.println("Tests finished");
    }


}