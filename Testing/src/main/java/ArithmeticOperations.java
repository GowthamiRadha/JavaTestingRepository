public class ArithmeticOperations {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Exception");
            return Integer.MIN_VALUE;
        }
        return a/b;
    }
}
