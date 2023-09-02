import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorSumTest.class,
        CalculatorSubTest.class,
        CalculatorDivTest.class,
        CalculatorMulTest.class
})

public class CalculatorTestSuite {

}
