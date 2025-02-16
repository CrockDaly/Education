package javatests.exercise2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//2. Write a Java test case to verify that a specific exception is thrown when a method is called with invalid input.
public class ExampleClassTest {
    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ExampleClass.divide(1, 0));
    }
    @ParameterizedTest
    @CsvSource({
            "5, 2, 2.5", // 5.0 / 2.0 = 2.5
            "0, 1, 0", // 0 / 1 = 0.0
            "1, 10, 0.1" // 1.0 / 10 = 0.1
    })
    void testDivideByNonZero(int a, int b, double expected) {
        assertEquals(expected, ExampleClass.divide(a, b));
    }
}
