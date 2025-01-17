package JavaBase.JavaGenericMethods.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Double> list2 = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        calculateSumOfEvenAndOdd(list);
        calculateSumOfEvenAndOdd(list2);
    }
public static <T extends Number> void calculateSumOfEvenAndOdd(List <T> numbers) {
    double sumEven = 0;
    double sumOdd = 0;

    for (var number : numbers) {
        if (number.doubleValue() % 2 == 0) {
            sumEven += number.doubleValue();
        } else {
            sumOdd += number.doubleValue();
        }
    }
    System.out.println("\nOriginal list of numbers: " + numbers);
    System.out.println("Sum of even numbers: " + sumEven);
    System.out.println("Sum of odd numbers: " + sumOdd);

    }
}
