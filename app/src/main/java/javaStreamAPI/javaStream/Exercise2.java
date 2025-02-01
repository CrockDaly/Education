package javaStreamAPI.javaStream;


import java.util.ArrayList;
import java.util.List;

//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("green");
        list.add("BLACK");
        list.add("WHITE");

        System.out.println("The original list is: " + list);

        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("The upper case list is: " + upperCaseList);

        List<String> lowerCaseList = list.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("The lower case list is: " + lowerCaseList);


    }
}
