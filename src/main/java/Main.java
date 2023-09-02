public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(-10, 5));
        System.out.println(cal.subtract(-12, -6));
        System.out.println(cal.subtract(10, 10));
        System.out.println(cal.subtract(10, 20));
        System.out.println(cal.sum(-10, 5));
        System.out.println(cal.multiply(-10, 5.6));
        System.out.println(cal.divide(-10, 5.6));
    }
}
