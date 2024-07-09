public class ArithmeticOperations {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
         if (b == 0) {
            System.out.println("Exception");  // Print a specific message instead of throwing an exception
            return Integer.MIN_VALUE;         // Return a special value indicating an error (could also be 0 or any other sentinel value)
        }
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
