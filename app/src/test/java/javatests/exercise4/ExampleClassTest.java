package javatests.exercise4;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Write a Java program that implements parameterized test to verify that a method behaves correctly for different input values.
public class ExampleClassTest {
    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "-2, 3, -6",
            "0, 5, 0",
            "7, -1, -7",
            "-4, -5, 20"
    })
    void testMultiply(int a, int b, int expected) {
        assertEquals(expected, ExampleClass.multiply(a, b));
    }
}
