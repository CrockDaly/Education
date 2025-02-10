package java_tests.exercise2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

//2. Write a Java test case to verify that a specific exception is thrown when a method is called with invalid input.
public class ExampleClassTest {
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> ExampleClass.divide(1, 0));
    }
}
