package javaStreamAPI.javaStream;


import java.util.ArrayList;
import java.util.List;

//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("The original list is: " + list);

        int sumOdd = list.stream()
                .filter(e -> e % 2 == 0)
                .reduce((a, e) -> a + e)
                .get();
        System.out.println("The sum of odd elements is: " + sumOdd);

        int sumEven = list.stream()
                .filter(e -> e % 2 != 0)
                .reduce((a, e) -> a + e)
                .get();
        System.out.println("The sum of even elements is: " + sumEven);

    }
}
