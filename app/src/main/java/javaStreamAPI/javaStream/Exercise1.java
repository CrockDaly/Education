package javaStreamAPI.javaStream;


import java.util.ArrayList;
import java.util.List;

//Write a Java program to calculate the average of a list of integers using streams.
public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("The original list is: " + list);

        double average = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);

        System.out.println("Average value of the list is: " + average);

    }
}
