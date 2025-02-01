package javaStreamAPI.javaLambda;


import java.util.ArrayList;
import java.util.List;


//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
public class Exercise5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kolya");
        list.add("Vasya");
        list.add("Mary");
        list.add("Alex");
        list.add("Bob");

        System.out.println("The original list is: " + list);

        list.sort(String::compareTo);
        System.out.println("The sorted list is: " + list);
    }
}