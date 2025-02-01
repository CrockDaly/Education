package javaStreamAPI.javaStream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to remove all duplicate elements from a list using streams.
public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);

        System.out.println("The original list is: " + list);

        List<Integer> distinctList = list.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("The distinct list is: " + distinctList);

    }
}
