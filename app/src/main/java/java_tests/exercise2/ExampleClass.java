package java_tests.exercise2;

public class ExampleClass {
    public static int divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
