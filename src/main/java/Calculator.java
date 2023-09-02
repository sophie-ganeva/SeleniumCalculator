import java.security.InvalidParameterException;

public class Calculator {
    public double sum(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double divide(double a,double b){
        if(a==0 || b==0){
            throw new InvalidParameterException("Invalid operation");
        }
        return a/b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
}