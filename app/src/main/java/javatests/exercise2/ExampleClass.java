package javatests.exercise2;

public class ExampleClass {
    public static double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(0, 1));
    }
}
