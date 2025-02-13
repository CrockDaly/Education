package javatests.exercise2;

public class ExampleClass {
    public static int divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
