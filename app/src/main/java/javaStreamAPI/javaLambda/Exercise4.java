package javaStreamAPI.javaLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("The original list is: " + arr);

        List<Integer> oddNumbers = arr.stream()
                .filter(element -> element % 2 == 0 )
                .toList();
        System.out.println("Odd numbers of the list is: " +oddNumbers);

        List<Integer> evenNumbers = arr.stream()
                .filter(element -> element % 2 != 0)
                .toList();
        System.out.println("Even numbers of the list is: " +evenNumbers);

    }
}
