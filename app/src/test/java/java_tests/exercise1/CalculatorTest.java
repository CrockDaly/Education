package java_tests.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//1. Write a Java unit test case to assert that a given method returns the expected value.
public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }
}
