import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.sql.SQLOutput;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTestSuite.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.getDescription());
            System.out.println(failure.getMessage());
        }
        System.out.println("REPORT:");
        System.out.println("Number of run tests: "+result.getRunCount());
        System.out.println("Number of failed tests: "+result.getFailureCount());
        System.out.println("Test execution time: "+result.getRunTime());
        System.out.println(result.wasSuccessful());
    }
}
