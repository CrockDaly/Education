package JavaBase.JavaExceptionHandling.Exercise2;

public class Main {
    public static void main(String[] args) {
       int num1 = 2;
       int num2 = 3;

       tryNumber(num1);
       tryNumber(num2);
    }
    public static void tryNumber(int number) {
        try {
            evenOrOdd(number);
            System.out.println(number + " is even");
        } catch (IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void evenOrOdd(int number) throws IllegalAccessException {
        if (number % 2 != 0) {
            throw new IllegalAccessException(number + " is odd");
        }
    }
}
