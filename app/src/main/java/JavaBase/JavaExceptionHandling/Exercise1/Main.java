package JavaBase.JavaExceptionHandling.Exercise1;

public class Main {
    public static void main(String[] args) {
        try {
            int result = devideNumbers(1,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int devideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
