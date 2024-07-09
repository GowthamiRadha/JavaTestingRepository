public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Addition: " + ArithmeticOperations.add(a, b));
        System.out.println("Addition: " + ArithmeticOperations.multiply(a, b));
        System.out.println("Addition: " + ArithmeticOperations.divide(a, b));
        System.out.println("Divide: "+ArithmeticOperations.divide(a, b));
    }
}
