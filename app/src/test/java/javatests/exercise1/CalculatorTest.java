package javatests.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

//1. Write a Java unit test case to assert that a given method returns the expected value.
public class CalculatorTest {
    @ParameterizedTest
    @CsvSource({
        "3, 5, 8",      // 3 + 5 = 8
        "10, 0, 10",    // 10 + 0 = 10
        "-10, 8, -2"    // -10 + 8 = -2
    })
    void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }
}
