public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[0].toLowerCase()) {
            case "add":
                result = ArithmeticOperations.add(a, b);
                break;
            case "subtract":
                result = ArithmeticOperations.subtract(a, b);
                break;
            case "multiply":
                result = ArithmeticOperations.multiply(a, b);
                break;
            case "divide":
                result = ArithmeticOperations.divide(a, b);
                break;
        }

        System.out.println(result);
    }
}
